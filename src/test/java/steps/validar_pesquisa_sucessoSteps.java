package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validar_pesquisa_sucessoSteps {

    WebDriver driver = new ChromeDriver();

    @Dado("^que estou no site do Agi$")
    public void acessar_Site_Agi() {
        driver.get("https://blogdoagi.com.br/");
        driver.manage().window().maximize();
    }

    @E("^eu clicar no ícone de lupa para pesquisar um conteúdo$")
    public void clicar_Icone_Pesquisa() {
        driver.findElement(By.id("search-open")).click();
    }

    @E("^clicar no campo para digitar minha pesquisa$")
    public void clicar_Campo_Pesquisa() {
        driver.findElement(By.className("search-field")).click();
    }

    @E("^inserir minha pesquisa$")
    public void digitar_Pesquisa() {
       driver.findElement(By.className("search-field")).sendKeys("agi lucra no primeiro trimestre");
    }

    @Quando("^clicar no botão para pesquisar$")
    public void clicar_Botao_Pesquisar() {
        driver.findElement(By.className("search-submit")).click();
    }

    @Então("^eu devo verificar o conteúdo retornado de acordo com a pesquisa$")
    public void retorno_Pesquisa() {
        String artigo_Retornado = driver.findElement(By.xpath("//*[@id=\"post-2436\"]/div[2]/div[2]/header/h2/a")).getText();
        Assert.assertEquals("Agi lucra R$ 27,3 milhões no primeiro trimestre de 2022, alta de 21,4%.", artigo_Retornado);

        driver.quit();
    }

}
