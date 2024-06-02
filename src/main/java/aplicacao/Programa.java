package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Programa {

    public static void main(String[] args) {

        // Tem que ser o nome do arquivo persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Pessoa p = em.find(Pessoa.class, 3);
        System.out.println(p);
        em.remove(p);
        System.out.println("Removido.");
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
