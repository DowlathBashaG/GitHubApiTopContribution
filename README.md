# GitHubApiTopContribution


Instructions:

 

1. Server port  : 9090

 

2. Code : Java 8

 

3. Url's :

 

    http://localhost:9090/api/users/DowlathBashaG

 

    http://localhost:9090/api/contributors?q&location=newyork&follow=followers

 

    implemented the above two urls.

 

Further API's for reference :

 

    https://api.github.com/users/newyorklenny/followers

 

    https://api.github.com/users/vani2/subscriptions

 

    https://api.github.com/repos/cortharlow/wdi-fundamentals-rps/contributors

 

   githubUsers

  .filter(user -> user.followers > 100)
  .sortBy('contributions')
  .slice(0,256)

 

Design :

 

   1. Once we received the list of users , ( data will stored in collections (Ex: Map))

 

   2. Users have followers and each followers have contributors url.

 

   3. From this url will get contributions.

 

   4. If I define a threshold value for contributions for example > 100 i am sorting the list .

 

   5. Based on top 50 , top 100 and top150. [ As per our requirement ].

 
