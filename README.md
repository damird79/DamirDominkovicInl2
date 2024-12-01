svar på frågor

clean rensar projekt, dvs tar bort target katalogen
[INFO] --- clean:3.2.0:clean (default-clean) @ library ---
[INFO] Deleting C:\Users\HP\Project\IntelliJ_projects\library\target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS

compile kompilerar vår källkod och konverterar den till klass filerna, skapar target katalog och underkataloger med 
bland annat alla våra klass filer, generated source katalog, maven-status katalog och test-classes

[INFO] --- compiler:3.13.0:compile (default-compile) @ library ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 11 source files with javac [debug target 21] to target\classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS

test kör alla enhetstester i projektet

[INFO] --- resources:3.3.1:resources (default-resources) @ library ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ library ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ library ---
[INFO] skip non existing resourceDirectory C:\Users\HP\Project\IntelliJ_projects\library\src\test\resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ library ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ library ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running models.BookCatalogTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.045 s -- in models.BookCatalogTest
[INFO] Running models.BookTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 s -- in models.BookTest
[INFO] Running models.LoanTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 s -- in models.LoanTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.593 s
[INFO] Finished at: 2024-12-01T13:39:58+01:00
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0

package paketerar kompilerade kod i jar fil

[INFO] --- jar:3.3.0:jar (default-jar) @ library ---
[INFO] Building jar: C:\Users\HP\Project\IntelliJ_projects\library\target\library-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS

javadoc genererar javadoc.resultat ser ut såhär

[INFO] --- javadoc:3.6.2:javadoc (default-cli) @ library ---
[INFO] No previous run data found, generating javadoc.
[WARNING] Javadoc Warnings osv.
