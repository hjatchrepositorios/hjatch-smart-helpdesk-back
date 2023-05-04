
package Helpdesk.Smart.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "Helpdesk.Smart.Repositories")
@EnableMongoAuditing
public class MongoConfig {
}
