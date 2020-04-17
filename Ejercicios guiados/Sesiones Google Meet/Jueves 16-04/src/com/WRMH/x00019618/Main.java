package com.WRMH.x00019618;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String menuPrincipal = "1. Administrador\n" +
                "2. Usuario\n" +
                "0. Salir\t";

        String menuAdmin = "1. Postear\n" +
                "2. Eliminar post\n" +
                "3. Ver interacciones\n" +
                "0. Regresar\t";

        String menuUsuario = "1. Comentar\n" +
                "2. Responder comentario\n" +
                "0. Regresar\t";

        String desc = "", cont = "";
        int postearMultimedia = 0;

        ArrayList<Post> postsPagina = new ArrayList<>();
        byte op = 0, op2= 0;
        byte idPost = 0, idComent = 0;

        do{
            System.out.print(menuPrincipal); op = in.nextByte(); in.nextLine();

            switch(op){
                // Admin
                case 1:
                    System.out.print(menuAdmin); op2 = in.nextByte(); in.nextLine();

                    switch (op2){
                        case 1:
                            System.out.print("Descripcion post: "); desc = in.nextLine();
                            Post nuevoPost = new Post(desc);

                            System.out.print("Postear multimedia: "); postearMultimedia = in.nextInt();
                            in.nextLine();

                            if(postearMultimedia == 1){
                                anadirMultimedia(nuevoPost);
                            }

                            postsPagina.add(nuevoPost);
                            break;
                        case 2:
                            System.out.print("ID post a eliminar: "); idPost = in.nextByte(); in.nextLine();
                            int idPostFinal = idPost;

                            postsPagina.removeIf(obj -> obj.getIdPost() == idPostFinal);
                            break;
                        case 3:
                            System.out.print("ID post a consultar: "); idPost = in.nextByte(); in.nextLine();
                            int idPostFinal2 = idPost;

                            postsPagina.forEach(obj -> {
                                if(obj.getIdPost() == idPostFinal2)
                                    System.out.println(obj.toString());
                            });
                            break;
                    }

                break;
                // Usuario
                case 2:
                    System.out.print(menuUsuario); op2 = in.nextByte(); in.nextLine();

                    switch(op2){
                        case 1:
                            try {
                                Post postComentar = null;

                                System.out.print("ID post a comentar: ");
                                idPost = in.nextByte();
                                in.nextLine();

                                for (Post p : postsPagina) {
                                    if (p.getIdPost() == idPost)
                                        postComentar = p;
                                }

                                if(postComentar == null)
                                    throw new NotExistingPostException("Post no existente");

                                System.out.print("Comentario: "); cont = in.nextLine();
                                postComentar.comentarPost(new Comentario(true, cont));
                            }
                            catch(NotExistingPostException ex){
                                System.out.print(ex.getMessage());
                            }
                            break;
                        case 2:
                            try {
                                Post postComentar = null;

                                System.out.print("ID post a comentar: ");
                                idPost = in.nextByte();
                                in.nextLine();

                                for (Post p : postsPagina) {
                                    if (p.getIdPost() == idPost)
                                        postComentar = p;
                                }

                                if(postComentar == null)
                                    throw new NotExistingPostException("Post no existente");

                                System.out.print("ID comentario a responder: "); idComent = in.nextByte();
                                in.nextLine();
                                System.out.print("Comentario: "); cont = in.nextLine();
                                postComentar.comentarPost(idPost, new Comentario(false, cont));
                            }
                            catch(SubCommentException|NotExistingCommentException|NotExistingPostException ex){
                                System.out.println(ex.getMessage());
                            }
                            break;
                    }
                break;
            }
        } while(op != 0);
    }

    public static void anadirMultimedia(Post p){
        byte op = 0;
        String tipo = "", formato = "", archivo = "";
        do{
            System.out.print("Imagen o video: "); tipo = in.nextLine();

            if(tipo.equalsIgnoreCase("Imagen")){
                System.out.print("Formato: "); formato = in.nextLine();
                System.out.print("Archivo: "); archivo = in.nextLine();

                Imagen img = new Imagen(formato, archivo);

                p.subirMultimedia(img);
            }
            else{
                System.out.print("Formato: "); formato = in.nextLine();
                System.out.print("Archivo: "); archivo = in.nextLine();

                Video vid = new Video(formato, archivo);

                p.subirMultimedia(vid);
            }

            System.out.print("Postear otro elemento: "); op = in.nextByte(); in.nextLine();

        } while(op != 0);
    }
}
