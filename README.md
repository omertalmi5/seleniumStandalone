firstAutomation

1. set up the grid :
docker-compose up

2. Run the tests:
or from terminal :mvn test
or build the image of tests and run it:
docker build -t imagename .
docker run imagename

Another option is do it together:
docker build -t imagename .
docker-compose up

In the tutorial he uses jar because he wants ude only jre and not jdk
because he wants thinner image as much
