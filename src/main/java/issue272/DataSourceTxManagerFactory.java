package issue272;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Factory
public class DataSourceTxManagerFactory {

    private DataSource dataSource;

    public DataSourceTxManagerFactory(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    DataSourceTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
