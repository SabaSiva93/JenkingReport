Feature: Booking Adactin Hotel by changing Room type Functionality


  Scenario Outline: User Booking Adactin Hotel by changing Room Type
    Given User shoud enter into Adactin login page
    When user should enter "<username>" and "<password>"
    And user should "<selctlocation>", "<hotel>","<room type>","<no of rooms>","<check in date>","<check out date>","<adults per room>","<child per room>"
    And user should click continue button
    And user should select hotel and click continue button
    And user should enter "<first name>","<last name>","<address>","<card number>","<card details>","<expiry month>","<expiry year>","<ccv>" and user should click continue
    Then user should get order detail
    

    Examples: 
      | username  | password    | selctlocation | hotel        | room type | no of rooms | check in date | check out date | adults per room | child per room | first name | last name | address              | card number         | card details | expiry month | expiry year | ccv |
      | karthi007 | Karthi@1989 | Brisbane      | Hotel Hervey | Standard  | 4 - Four    | 26-Aug-2020   | 28-Aug-2020    | 2 - Two         | 0 - None       | Raj        | Kumar     | west streest,chennai | 5432 2345 7890 1234 | Master Card  | July         |        2021 | 234 |


 