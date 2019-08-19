
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class CrudPacientes {

    ObjectOutputStream escrita;
    ObjectInputStream leitura;
    ArrayList<String> listaCodigos;
    ArrayList<Paciente> listaPacientes;
    HashMap<String, Paciente> hMlistaPacientes;
    int codigoPaciente = 1;
    
    public CrudPacientes() {
        listaPacientes = new ArrayList<>();
        listaCodigos = new ArrayList<>();
        hMlistaPacientes = new HashMap<>();
    }
    
    public void cria(Paciente paciente) {
        String codigo = paciente.getCodigo();
        
        listaPacientes.add(paciente);
        listaCodigos.add(codigo);
      
        escrevePacientesNoArquivo();
        escreveCodigosNoArquivo();        
    }
    
    public void escrevePacientesNoArquivo() {
       try {
          escrita = new ObjectOutputStream(new FileOutputStream("dados.dat"));
          for (int i = 0; i < listaPacientes.size(); i++) {
                escrita.writeObject(listaPacientes.get(i));
            }
            escrita.close();
        } catch (IOException e) {
            System.out.println("Não é possível escrever no arquivo...." 
                                                      + e.getMessage());
        }
    }
    
    public void escreveCodigosNoArquivo() {
        try {
          escrita = new ObjectOutputStream(new FileOutputStream("codigos.dat"));
            for (int i = 0; i < listaCodigos.size(); i++) {
                escrita.writeObject(listaCodigos.get(i));
            }
            escrita.close();
        } catch (IOException e) {
            System.out.println("Não é possível escrever códigos no arquivo...." 
                                                             + e.getMessage());
        }
    }
   
    public void leObjetosArquivoDados() {
        try {
            leitura = new ObjectInputStream(new FileInputStream("dados.dat"));
            Paciente paciente;
            do {
                paciente = (Paciente) leitura.readObject();
                if (paciente != null) {
                   this.listaPacientes.add(paciente);
                   this.hMlistaPacientes.put(paciente.getCodigo() , paciente);
                }
            } while (paciente != null);
            leitura.close();
        } catch (EOFException eof) {
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    public void leObjetosArquivoCodigos() {
        try {
            leitura = new ObjectInputStream(new FileInputStream("codigos.dat"));
            String codigo;
            do {
                codigo = (String) leitura.readObject();
                if (codigo != null) {
                    this.listaCodigos.add(codigo);
                    int cod = Integer.parseInt(codigo);
                    codigoPaciente = cod+1;
                }
            } while (codigo != null); 
            
            leitura.close();
            
        } catch (EOFException eof) {

        } catch (IOException | ClassNotFoundException e) {
        }
    }

    public void atualizar(String codigo, Paciente p) {
        
        hMlistaPacientes.get(codigo).setNome(p.getNome());
        hMlistaPacientes.get(codigo).setIdade(p.getIdade());
        hMlistaPacientes.get(codigo).setAltura(p.getAltura());
        hMlistaPacientes.get(codigo).setPressao(p.getPressao());
        hMlistaPacientes.get(codigo).setPeso(p.getPeso());
         
        escrevePacientesNoArquivo();
    }
    
    /*public void removeObjetoArquivos(String ind) {
        Aluno aluno;
        aluno = listaAlunos.get(ind);
        if (aluno != null) {
            listaAlunos.remove(ind, aluno);
            listaIndices.remove(ind);

            escrevePacientesNoArquivo();
           

        } else {
            System.out.println("Remoção não pode ser feita...");
        }
    }*/
   

}
