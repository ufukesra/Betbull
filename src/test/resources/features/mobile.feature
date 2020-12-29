Feature: Mobile Task Test

  @mobile
  Scenario: Scenario 1
  Given Open Storytel app
  When Swipe stories to left and right and verify swiping works correctly
  Then Click on “Try it out” button
  And Scroll down to find “Iceland” selection
  When Select “Iceland” and click “Done”
  Then Select only “English” from languages selections page and click “Done”
  And Scroll down to find “Feelgood” text from Book tips page
  When Swipe left on “Feelgood” section books and click on the 7th item from the list
  Then Verify correct book is clicked
  And Click like button
  When Fill a valid email and password and click “Continue” button
  Then Click I Accept button (Ég samþykki)
  And Click “No thanks” to Marketing Consent popup
  When Click Back button to close “Welcome to Storytel!” page
  Then Click Like button and verify book is saved to bookshelf
  And Click ← to go back to Book tips
  When Open Side Menu
  Then Click Search button
  And Swipe left to “Series” section
  When Search for “Harry”
  Then Swipe up on search result to find “The Advantures of Harry Stevenson” and click on it
  And Verify that page is the correct page
  When Click Filter
  Then Remove Ebook from Filter list and click “Done”
  And Verify “Oops! It seems you've filtered a bit too much.” text on the screen.