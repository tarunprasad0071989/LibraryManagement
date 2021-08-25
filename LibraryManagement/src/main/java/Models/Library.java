package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Library")
public class Library  implements Serializable {

    @Column(name ="book_name")
    String bookName;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name='id')
    private Long id;

    public Library() {

    }
}
