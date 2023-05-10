Feature: mail

  Scenario: sending mail
    Given send mail to "apj@abdulkalm.com" with "wishes" as subject and body as:
      """
      hi sir,
        how are you?
        bye sir.

      """
