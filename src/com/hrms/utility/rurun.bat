set projectLocation=E:\Eclipse\EclipseProgram\Frames
cd %projectLocation%
set classpath=%projectLocation%bin;%projectLocation%\lib\*
java org.testng.TestNG%projectLocation%\testsuite1.xml