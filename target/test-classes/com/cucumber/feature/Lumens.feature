 Feature: Login,add to cart,apply promo code and logout the  Lumens application
 
  
 
    Scenario: Create Account
    Given Launch the lumens site
    When Enter firstname,lastname,password and email to create account
    Then Home page has populated
    
     Scenario: Login account
    Given Launch the lumens site
    When Enter password and click login
    Then Home page has populated
    
    
     Scenario: Add to cart product
    Given Launch the lumens site
    When Enter password,click login and add to cart the product
    Then product has added to cart successfully
    
     Scenario: Apply promo code to cart
    Given Launch the lumens site
    When Enter password,click login and apply promo code to cart 
    Then promo code is not valid
    
     Scenario: Login account and verify scroll
    Given Launch the lumens site
    When Enter password,click login and verify scroll
    Then Home page has populated and verified scroll up and down successfully
    
     Scenario: Logout account
    Given Launch the lumens site
    When Enter password,click login and logout
    Then Home page has populated
    