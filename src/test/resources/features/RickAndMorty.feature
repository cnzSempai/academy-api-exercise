Feature: Rick and Morty
  As an api user I want to execute request in order to get proper responses

  @RyM @ok
  Scenario Outline: Pedimos un personaje al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParameters>'
    Then I will get the proper status code '<statusCode>'
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>

    Examples:
      | jsonName         | statusCode | inputParameters | operation | entity    | jsonNameResponse     |
      | RyM/rq_character | 200        | character:2     | GET       | CHARACTER | RyM/rs_character_200 |

  @RyM @prueba
  Scenario Outline: Pedimos una simple locacion al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParameters>'
    Then I will get the proper status code '<statusCode>'
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>

    Examples:
      | jsonName        | statusCode | inputParameters | operation | entity   | jsonNameResponse    |
      | RyM/rq_location | 200        | location:2      | GET       | LOCATION | RyM/rs_location_200 |

  @RyM @prueba2
  Scenario Outline: Pedimos multiples locaciones al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParameters>'
    Then I will get the proper status code '<statusCode>'
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>

    Examples:
      | jsonName        | statusCode | inputParameters    | operation | entity   | jsonNameResponse    |
      | RyM/rq_location | 200        | location:[2,21,34] | GET       | LOCATION | RyM/rs_location_200 |