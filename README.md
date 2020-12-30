# Wibbitz-Automation-Test
Wibbitz Automation Test

I designed my tests in JAVA selenium in Eclipse workspace, and plan the test scenario and the defect in excel.

About testing site:
Wibbitz it's a site that allows to create and edit online video in minutes.

TESTS:
First, I'm signup to "https://studio.wibbitz.com/#/signup" site 
Then I started checking, the tests I performed:
1. First of all I checked sanity tests, my goal was to make sure the site was running. (valid/invalid Login test, spans appear testing, search box testing).
2. Create a new video, and test if the video is displayed on my video list.
3. Play the first video and Control the playback of the video
4. Search a video by clicking an exist title, and by clicking a contain string in the exist title (The expected result is view videos whose title contains the string but the actual result is a no results).

DEFECTS:
I report a low defect in the 4th test: Enter "titled" a string that is in the title of the video you are search "Untitled".The expected result is displayed "Untitled" video, but the actual result a message of no results 
    
