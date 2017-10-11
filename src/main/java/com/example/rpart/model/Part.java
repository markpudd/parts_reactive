package com.example.rpart.model;

        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;
        import lombok.ToString;
        import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="parts")
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Data
public class Part {


    private String description;
    private String category;
    private String image;

}
