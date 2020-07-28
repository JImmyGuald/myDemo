package com.lotus.demo;

/**
 * TODO
 *
 * @author ganj
 * @date 2020/7/24 17:15
 */
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Author djw
 * @Description mybatisPlus代码生成器
 * @Date 2019/12/4 10:55
 */
public class MybatisPlusGenerator {

    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = "D:/IdeaProjects/myDemo";
        // 配置代码输出目录
        gc.setOutputDir(projectPath + "/src/main/java");
        // 配置作者
        gc.setAuthor("ganj");
        //生成完毕后是否打开文件夹
        gc.setOpen(false);
        //实体属性 Swagger2 注解
        gc.setSwagger2(true);
        //是否覆盖已有的代码
        gc.setFileOverride(true);
//        gc.setActiveRecord(true);
        //设置生成的日期类型为 Date
        gc.setDateType(DateType.ONLY_DATE);
        generator.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://localhost:3306/lotus?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        generator.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.lotus.demo");
        generator.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 命名规则
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //设置表中对应的下划线字段名
        strategy.setEntityTableFieldAnnotationEnable(true);
        strategy.setEntityBuilderModel(true);
        //strategy.setSuperEntityClass("com.example.mybatisplus.common.BaseEntity");
        // 实体是否使用Lombok插件
        strategy.setEntityLombokModel(true);
        // 控制层是否使用Rest风格
        //strategy.setRestControllerStyle(true);
        //strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
        //需要生成的表数组
        strategy.setInclude(new String[]{"test"});
//        strategy.setSuperEntityColumns("id");
//        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setTablePrefix(pc.getModuleName() + "_");
        generator.setStrategy(strategy);

        //创建模板
        TemplateConfig config = new TemplateConfig();
        //设置为null代表不生成
        //config.setController(null);
        //config.setXml(null);
        generator.setTemplate(config);

        generator.execute();
    }
}


