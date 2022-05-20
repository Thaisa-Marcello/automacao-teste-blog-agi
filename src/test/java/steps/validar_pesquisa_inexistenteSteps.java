package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validar_pesquisa_inexistenteSteps {

    WebDriver driver = new ChromeDriver();

    @Dado("^que estou no site do Agibank$")
    public void acessar_Site_Agibank() {
        driver.get("https://blogdoagi.com.br/");
        driver.manage().window().maximize();
    }

    @E("^eu clicar no ícone de lupa para pesquisar um conteúdo no blog$")
    public void clicar_Icone_Pesquisa_Blog() {
        driver.findElement(By.id("search-open")).click();
    }

    @E("^clicar no campo para digitar minha pesquisa inexistente$")
    public void clicar_Campo_Pesquisa_Inexistente() {
        driver.findElement(By.className("search-field")).click();
    }

    @E("^inserir minha pesquisa inexistente no campo$")
    public void digitar_Pesquisa_Inexistente_Campo() {
        driver.findElement(By.className("search-field")).sendKeys("pesquisainexistente");
    }

    @Quando("^clicar no botão para realizar a pesquisa$")
    public void clicar_Botao_Pesquisar() {
        driver.findElement(By.className("search-submit")).click();
    }

    @Então("^uma mensagem deve informar que aquele conteúdo não existe no blog$")
    public void verificar_Mensagem_Informativa() {
        String mensagem_Retornada = driver.findElement(By.xpath("//*[@id=\"primary\"]/section/header/h1")).getText();
        Assert.assertEquals("Nenhum resultado", mensagem_Retornada);

        driver.quit();


    }

}
