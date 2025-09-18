@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://178.62.54.206:8089") // ou "*"
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }
        };
    }
}
