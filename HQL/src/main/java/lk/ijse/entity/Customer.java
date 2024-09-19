package lk.ijse.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Customer {

    @Id
    private int id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "customer",fetch = FetchType.EAGER)
    List<Address> addresses;

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + id +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }

}
