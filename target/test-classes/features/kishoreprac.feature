Feature: cross browser

  Scenario Outline: 
    open a browser for giving version

    Given open "<bn>" browser which version is "<v>"

    Examples: 
      | bn     | v             |
      | chrome | 96.0.4664.110 |
      | edge   | 96.0.1054.621 |
