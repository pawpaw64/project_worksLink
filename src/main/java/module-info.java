module com.example.project_workslink {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.project_workslink to javafx.fxml;
    exports com.example.project_workslink;
}