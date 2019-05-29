echo "starting script"
cd /WestPacInterview/interview
mvn clean test -DdriverName=Firefox -Dcucumber.options="--tags @KiwiSaverCalc"
echo "ending script"