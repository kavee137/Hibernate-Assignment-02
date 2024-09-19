package lk.ijse;

import lk.ijse.config.SessionFactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction tx = session.beginTransaction();

        //inert
//        Customer customer = new Customer();
//        customer.setId(5);
//        customer.setName("kirisaman");
//        session.save(customer);

        //delete
//        String JpqlDelete = "delete from Customer c where c.id = :id";
//        Query query = session.createQuery(JpqlDelete);
//        query.setParameter("id",1);
//        query.executeUpdate();

        //update
//        String jpqlUpdate = "update Customer c set c.name = :name , c.address =:address where c.id=:id";
//        Query query = session.createQuery(jpqlUpdate);
//        query.setParameter("name", "James");
//        query.setParameter("address", "gampaha");
//        query.setParameter("id", 2);
//        query.executeUpdate();


        //search
//        String jpqlsearch = "SELECT c FROM Customer c WHERE c.name = :name";
//        Query query = session.createQuery(jpqlsearch);
//        query.setParameter("name", "James");
//
//        List<Customer> customers = query.list();
//        for (Customer c : customers) {
//            System.out.println("ID: " + c.getId());
//            System.out.println("Name: " + c.getName());
//        }

        String hql4 = "select a.aid, a.city, a.street from Address a inner join Customer c on a.customer = c ";
        Query query = session.createQuery(hql4);
        List <Object[]> customerr = query.list();
        for (Object[] o : customerr) {
            System.out.println(Arrays.toString(o));
        }


        tx.commit();
        session.close();
    }
}