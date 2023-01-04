<h1>📋 Descrição sobre as classes criadas na pasta pages</h1>

Os códigos fazem parte de uma aplicação que utiliza o Selenium para automatizar testes em páginas web. 

➔ Caminho dos arquivois citados: automation-practice-selenium-DIO/automation-practice-selenium-DIO/src/test/java/pages/

<h2>BasePage</h2>

A classe BasePage é uma classe abstrata que fornece funcionalidades genéricas para as demais classes do projeto.

A classe BasePage possui os seguintes atributos:

- driver: objeto do tipo WebDriver, responsável por controlar o navegador
- action: objeto do tipo Actions, utilizado para simular ações do mouse em elementos da página
- select: objeto do tipo Select, utilizado para selecionar elementos em uma lista dropdown

A classe BasePage possui os seguintes métodos:

- visit(url): abre uma página específica no navegador
- getCurrentUrl(): retorna a URL atual do navegador
- quitWebDriver(): fecha o navegador
- findElement(locator): retorna um elemento da página localizado pelo parâmetro locator
- type(input, locator): preenche um elemento de input com o texto especificado pelo parâmetro input
- isDisplayed(locator): verifica se um elemento está visível na página
- click(locator): clica em um elemento da página
- getText(locator): retorna o texto presente em um elemento da página
- actionMoveToElementPerform(locator): move o mouse para um elemento da página
- actionMoveToElementClickPerform(locator): move o mouse para um elemento da página e clica nele
- selectElementPerform(locator, value): seleciona um elemento em uma lista dropdown pelo seu valor
- clear(locator): limpa o conteúdo de um elemento de input.

<h2>LoginPage</h2>

O package pages contém a classe LoginPage, que herda de uma classe BasePage e implementa funcionalidades específicas para a página de login de uma aplicação.

Possui os seguintes atributos:

- usernameLocator: localizador do elemento de input de email/username na página de login
- passwordLocator: localizador do elemento de input de senha na página de login
- loginBtnLocator: localizador do botão de login na página de login
- tagTextProducts: localizador de um elemento span na página

Possui os seguintes métodos:

signin(): realiza o login na aplicação, preenchendo o input de email/username e senha e clicando no botão de login. Verifica se o elemento de input de email/username está presente na página antes de prosseguir;

getSpanProductsMessage(): retorna o texto presente no elemento span localizado pela variável tagTextProducts.

🔸 Observação: o método isDisplayed() é herdado da classe BasePage e verifica se um elemento está visível na página. O método type() é herdado da classe BasePage e preenche um elemento de input com um texto específico. O método click() é herdado da classe BasePage e clica em um elemento. O método getText() é herdado da classe BasePage e retorna o texto presente em um elemento.

<h2>ProductsPageOptionName</h2>
A classe ProductsPageOptionName herda de uma classe BasePage e implementa funcionalidades específicas para a página de produtos de uma aplicação.

Possui os seguintes atributos:

- optionName: localizador de um elemento select na página de produtos
- submenuPriceLowToHighLocator: localizador de uma opção em um elemento select na página de produtos
- titlePageH1Locator: localizador de um elemento div na página

Possui os seguintes métodos:

- viewProductsPage(): seleciona uma opção em um elemento select na página de produtos. Verifica se o elemento select está presente na página antes de prosseguir.
- getTextH1(): retorna o texto presente no elemento div localizado pela variável titlePageH1Locator.

🔸 Observação: O método isDisplayed() é herdado da classe BasePage e verifica se um elemento está visível na página. O método selectElementPerform() é herdado da classe BasePage e seleciona um elemento em uma lista dropdown pelo seu valor. O método getText() é herdado da classe BasePage e retorna o texto presente em um elemento.

<h1>📋 Descrição sobre as classes criadas na pasta tests</h1>

O código faz parte de uma aplicação que utiliza o Selenium para automatizar testes em páginas web.

<h2>LoginPageTest</h2>
A classe LoginPageTest é uma classe de teste JUnit que verifica se o login em uma página é realizado com sucesso.

Possui os seguintes atributos:

- loginPage: objeto da classe LoginPage, responsável por fornecer as funcionalidades de login
- URL: URL da página de login

Possui os seguintes métodos:

- setUp(): é executado antes de cada teste e inicializa o objeto loginPage e abre a página de login
- tearDown(): é executado depois de cada teste e fecha o navegador
- test(): é o método de teste em si, que verifica se o login é realizado com sucesso e se a página de produtos é acessada após o login.

🔸 Observação: o método signin() é da classe LoginPage e realiza o login na aplicação. O método getSpanProductsMessage() é da classe LoginPage e retorna o texto presente em um elemento span na página. O método getCurrentUrl() é da classe BasePage e retorna a URL atual do navegador. O método visit(url) é da classe BasePage e abre uma página específica no navegador. O método quitWebDriver() é da classe BasePage e fecha o navegador.

<h2>ProductsPageOptionNameTest</h2>
A classe ProductsPageOptionNameTest é uma classe de teste JUnit que verifica se é possível filtrar os produtos por preço (crescente) na página de produtos.

Possui os seguintes atributos:

- productsPage: objeto da classe ProductsPageOptionName, responsável por fornecer as funcionalidades de filtragem de produtos
- URL: URL da página de produtos

Possui os seguintes métodos:

- setUp(): é executado antes de cada teste e inicializa o objeto productsPage e abre a página de produtos
- tearDown(): é executado depois de cada teste e fecha o navegador (comentado no código)
- test(): é o método de teste em si, que verifica se é possível filtrar os produtos por preço (crescente). O teste está comentado, portanto não é executado.

🔸 Observação: o método viewProductsPage() é da classe ProductsPageOptionName e seleciona uma opção de filtragem de produtos. O método getTextH1() é da classe ProductsPageOptionName e retorna o texto presente em um elemento div na página. O método getCurrentUrl() é da classe BasePage e retorna a URL atual do navegador. O método visit(url) é da classe BasePage e abre uma página específica no navegador. O método quitWebDriver() é da classe BasePage e fecha o navegador.
