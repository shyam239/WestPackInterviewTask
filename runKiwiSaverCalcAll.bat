echo "starting script"
cd /WestPacInterview/interview
mvn clean test -Dcucumber.options="--tags @KiwiSaverCalc"
echo "ending script"