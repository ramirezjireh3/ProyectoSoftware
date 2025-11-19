package avoluxe.controller;
import java.util.*;import avoluxe.model.Usuario;
public class ControladorUsuarios {private static ArrayList<Usuario> usuarios=new ArrayList<>();
static{usuarios.add(new Usuario("admin","1234"));}
public static boolean validar(String u,String p){return usuarios.stream().anyMatch(x->x.getUsuario().equals(u)&&x.getPassword().equals(p));}
public static boolean registrar(String u,String p){if(usuarios.stream().anyMatch(x->x.getUsuario().equals(u)))return false;usuarios.add(new Usuario(u,p));return true;}}