package com.example.firstboot.conf;


/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.example.firstboot.conf
 * date:   2018-05-31 15:41
 */
/*@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ReaderRepository readerRepository;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                //访问根路径需要READER权限
                .antMatchers("/").access("hasRole('READER')")
                .antMatchers("/**").permitAll()

                .and()

                .formLogin()
                //登录表单的路径
                .loginPage("/login")
                .failureForwardUrl("/login?error=true");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(new UserDetailsService(){
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return readerRepository.findByUsername(username);
            }
        });
    }
}*/
