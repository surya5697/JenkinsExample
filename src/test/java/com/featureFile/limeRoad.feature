Feature: We can orderToBuy a product by using a limeRoad ecommerce web application

 
Scenario: User to search a prodcut for men 
Given User launch the url "https://www.limeroad.com/" 
When User click the shopMen button and navigateTo homePage

Scenario: User login the account by using the login functionality
When User moveTo profile field  
And User click the login button and user navigateTo signIn page
And User enter the mobileNo on the mobileNo field 
And User click the next button
And User enter the otp on otp field
Then User click the verify button and user navigateTo the home page
 

Scenario: User wants to buy a jean 
When User moveTo click the jean product and navigateTo jean list field
And User choose to click the Denim Jeans product
And User prefer to click the jean size
And User wants to click the jean AddToCart button


Scenario: User wants to buy a footWear 
When User moveTo click the footWear product and navigateTo footwear list field
And User choose to click the Easy Meets Cool product
And User prefer to click the footWear size
And User wants to click the footwear AddToCart button


Scenario:  User wants to buy a kids product 
When User moveTo click the kids product and navigateTo kids list field
And User choose to click the Wedding Special Edit product
And User prefer to click the kid dress size
And User wants to click the kids product AddToCart button 
And tearDown thr browser 
