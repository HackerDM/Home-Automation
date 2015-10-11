# Home-Automation
How to acess the pi
open terminal and type the following command
ssh pi@10.30.13.72 -p 10000

how to see the webpage
open your browser and type in 10.30.13.72:11000/HomeAutomation/Home-Automation and you get to see the homepage

how to access the server files
ssh into the pi and navigate to /var/www/HomeAutomation/Home-Automation/
Any change made to this will be reflected on the website.
If you want to make any changes, make it on your computer and push it to github, then log into the pi and git pull in the directory.
