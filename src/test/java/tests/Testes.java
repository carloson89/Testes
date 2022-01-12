package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Testes {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {
        // Abrir o nevegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers web\\chromedriver_win32//chromedriver.exe");
        this.navegador = new ChromeDriver();

        // vou maximizar o nevegador
        this.navegador.manage().window().maximize();

        // vou definir um tempo de espera padrão de 5 segundos
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // nevegar para a página do URI judge
        this.navegador.get("https://www.beecrowd.com.br/judge/pt/login?origem=1");

    }

    @Test
    @DisplayName("Login")
    public void Login() {

        navegador.findElement(By.linkText("OK!")).click();
        navegador.findElement(By.name("email")).sendKeys("carlos.on89@outlook.com");
        navegador.findElement(By.name("password")).sendKeys("Potherss002152");
        navegador.findElement(By.cssSelector("input[type='submit']")).click();

    }

    @Test
    @DisplayName("Validar botão buscar")
    public void ValidarBotaoBuscar() {

        navegador.findElement(By.linkText("OK!")).click();
        navegador.findElement(By.name("email")).sendKeys("carlos.on89@outlook.com");
        navegador.findElement(By.name("password")).sendKeys("Potherss002152");
        navegador.findElement(By.cssSelector("input[type='submit']")).click();
        navegador.findElement(By.name("q")).sendKeys("1022");
        navegador.findElement(By.cssSelector("input[type='submit']")).click();

    }

    @Test
    @DisplayName("Escolher o problema")
    public void EscolherProblema() {

        navegador.findElement(By.linkText("OK!")).click();
        navegador.findElement(By.name("email")).sendKeys("carlos.on89@outlook.com");
        navegador.findElement(By.name("password")).sendKeys("Potherss002152");
        navegador.findElement(By.cssSelector("input[type='submit']")).click();
        navegador.findElement(By.name("q")).sendKeys("1022");
        navegador.findElement(By.cssSelector("input[type='submit']")).click();
        navegador.findElement(By.linkText("TDA Racional")).click();


    }



}






