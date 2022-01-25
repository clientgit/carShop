### Написать REST-сервис для магазина БУ автомобилей.
__________________________________________________________
1.  API должен содержать CRUD для каждой сущности бизнес-модели:
	* марка
		+ наименование
		+ страна

	- модель
		+ наименование
		+ год начала производства
		+ год окончания производства

	- позиция в магазине
		+ марка
		+ модель
		+ год выпуска
		+ пробег
		+ цена


2. API должен содержать метод поиска по позициям в магазине.

3. Технологии: Play Framework, MyBatis, в качестве БД H2 с эмуляцией PostgreSQL, 
   DDL в отдельных скриптах эволюций (evolutions scripts)

### ![ij](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/80px-IntelliJ_IDEA_Icon.svg.png)  _Run Project_   
__________________________________________________________
1. [ **Download Idea Ultimate** ](https://www.jetbrains.com/ru-ru/idea/download/#section=linux)
2. [ **To start working with Scala in IntelliJ IDEA you need to download and enable the Scala plugin.** ](https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html#UserInterface)
![scalaPlagin](https://resources.jetbrains.com/help/img/idea/2021.3/scala_plugin_page.png)
3. **Importing an sbt project into IntelliJ**
   + File menu -> New -> Project from Existing Sources...
   + Select a file that contains your sbt project description build.sbt. Click OK.
4. **Add new run configuration - _Play 2 App_**
5. **_Run_ project**
6. **Go to _localhost:9000_ and apply evolution database**
7. **Routing API file**
   + autoshop -> conf -> routes

### ![sbt](https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Sbt-logo.svg/139px-Sbt-logo.svg.png) _Run Project_ 
__________________________________________________________
1. [**Download & Install sbt.version=1.3.13**](https://www.scala-sbt.org/download.html)
2. **Go to project derictory that contains your sbt project description build.sbt.  -** `cd ~/your_clone_project`
3. **Check installation sbt  -** `sbt --version`
4. **Terminal commands** 
    + build project - `sbt compile`
    + run project - `sbt run`
5. **Go to _localhost:9000_ and apply evolution database**
6. **Routing API file**
    + autoshop -> conf -> routes
