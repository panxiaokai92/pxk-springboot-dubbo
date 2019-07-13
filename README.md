# pxk-springboot-dubbo
**注意要点**
* provider项目启动器需要加上 @EnableDubbo注解
* provider项目的serviceImpl实现，@Service使用Dubbo的注解（Consumer使用spring的@Service注解）
* api项目进行剥离jar包，provider和consumer分别进行依赖引用



