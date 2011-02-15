
/**
 * UML Diagram of Triangle and GeometricObject
 *
 * +-----------------------------------------+
 * | [m] = method                            |
 * | [p] = property/field                    |
 * |-----------------------------------------|
 * | Account (abstract)                      |
 * | + p  account number                     |
 * | + p  balance                            |
 * | + p  annual interest rate               |
 * | + p  date created                       |
 * | + m  deposit                            |
 * | + m  withdraw                           |
 * |                                         |
 * | CheckingAccount                         |
 * | + p  overDraftLimit                     |
 * | + m  withdraw (override for overdrafts) |
 * |                                         |
 * | SavingAccount                           |
 * | + m  withdraw                           |
 * |   -  (override for overdraft 'throw')   |
 * +-----------------------------------------+
 */

