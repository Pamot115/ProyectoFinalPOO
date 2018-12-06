package DataBase;

import java.io.*;
import java.util.ArrayList;

public final class PersistenciaUsuario {
    ArrayList<Usuario> Users;
    File f;
    FileOutputStream fout;
    ObjectOutputStream obout;
    
     public PersistenciaUsuario(String name) throws Exception {
        Users = new ArrayList<>();
        f = new File(name);
    }
     
    public void guardar (Usuario u) throws Exception{
        fout = new FileOutputStream(f);
        obout= new ObjectOutputStream(fout);
        Users.add(u);
        obout.writeObject(Users);
    }
    
    public ArrayList<Usuario> leerTodos()throws Exception{
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Users = (ArrayList<Usuario>)ois.readObject();
        return Users;
    }
    
    public void borra(int Pos) throws Exception{
        fout= new FileOutputStream(f);
        obout= new ObjectOutputStream(fout);
        Users.remove(Pos);
        obout.writeObject(Users);
    }
    
    public void actualiza(int id, String name, int age, float sal) throws Exception{
        fout= new FileOutputStream(f);
        obout= new ObjectOutputStream(fout);
        Users.get(id).setAge(age);
        Users.get(id).setName(name);
        Users.get(id).setSalary(sal);
        obout.writeObject(Users);
    }
}
