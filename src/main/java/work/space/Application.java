package work.space;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("work.space.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
// 扫描全部的mapper @MapperScan("org.project.image.mapper")
// 否则就要在每一个mapper上面加入 @Mapper 比较麻烦
