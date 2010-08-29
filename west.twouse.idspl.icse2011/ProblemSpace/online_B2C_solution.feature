<?xml version="1.0" encoding="UTF-8"?>
<feature:FeatureModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:feature="http://www.tudresden.de/feature" name="online_B2C_solution">
  <root name="online-B2C-solution.emx" minCardinality="1" maxCardinality="1">
    <groups maxCardinality="1">
      <childFeatures name="eCommerce" minCardinality="1" maxCardinality="1">
        <groups maxCardinality="2">
          <childFeatures name="Storefront" minCardinality="1" maxCardinality="1">
            <groups maxCardinality="8">
              <childFeatures name="Buy Path" minCardinality="1" maxCardinality="1">
                <groups maxCardinality="3">
                  <childFeatures name="Shopping Cart" minCardinality="1" maxCardinality="1">
                    <groups maxCardinality="4">
                      <childFeatures name="Inventory Management Policy" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Cart Content Page" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Cart Summary Page" maxCardinality="1"/>
                      <childFeatures name="Cart Saved After Session" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Checkout" minCardinality="1" maxCardinality="1">
                    <groups maxCardinality="4">
                      <childFeatures name="Checkout Type" minCardinality="1" maxCardinality="1">
                        <groups minCardinality="1" maxCardinality="2">
                          <childFeatures name="Registered Checkout" maxCardinality="1">
                            <groups maxCardinality="1">
                              <childFeatures name="Quick Checkout Profile" maxCardinality="1">
                                <groups maxCardinality="1">
                                  <childFeatures name="Enable Profile Update on Checkout" maxCardinality="1"/>
                                </groups>
                              </childFeatures>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Guest Checkout" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Shipping Options" maxCardinality="1">
                        <groups maxCardinality="5">
                          <childFeatures name="Quality of Service Selection" maxCardinality="1"/>
                          <childFeatures name="Carrier Selection" maxCardinality="1"/>
                          <childFeatures name="Gift Options" maxCardinality="1"/>
                          <childFeatures name="Multiple Shipments" maxCardinality="1"/>
                          <childFeatures name="Shipping Cost Calculation" minCardinality="1" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Taxation Options" minCardinality="1" maxCardinality="1">
                        <groups minCardinality="1" maxCardinality="1">
                          <childFeatures name="Custom Taxation" maxCardinality="1">
                            <groups maxCardinality="2">
                              <childFeatures name="Type" minCardinality="1" maxCardinality="1">
                                <groups minCardinality="1" maxCardinality="2">
                                  <childFeatures name="Fixed-Rate Taxation" maxCardinality="1"/>
                                  <childFeatures name="Rule-Based Taxation" maxCardinality="1">
                                    <groups maxCardinality="2">
                                      <childFeatures name="Tax Codes" minCardinality="1" maxCardinality="1"/>
                                      <childFeatures name="Address" minCardinality="1" maxCardinality="1">
                                        <groups maxCardinality="3">
                                          <childFeatures name="Shipping" minCardinality="1" maxCardinality="1"/>
                                          <childFeatures name="Billing" maxCardinality="1"/>
                                          <childFeatures name="Resolution" minCardinality="1" maxCardinality="1">
                                            <groups minCardinality="1" maxCardinality="3">
                                              <childFeatures name="Country" maxCardinality="1"/>
                                              <childFeatures name="Region" maxCardinality="1"/>
                                              <childFeatures name="City" maxCardinality="1"/>
                                            </groups>
                                          </childFeatures>
                                        </groups>
                                      </childFeatures>
                                    </groups>
                                  </childFeatures>
                                </groups>
                              </childFeatures>
                              <childFeatures name="Amount Specification" minCardinality="1" maxCardinality="1">
                                <groups minCardinality="1" maxCardinality="2">
                                  <childFeatures name="Surcharge" maxCardinality="1"/>
                                  <childFeatures name="Percentage" maxCardinality="1"/>
                                </groups>
                              </childFeatures>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Tax Gateways" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="3">
                              <childFeatures name="CertiTAX" maxCardinality="1"/>
                              <childFeatures name="CyberSource" maxCardinality="1"/>
                              <childFeatures name="Custom Tax Gateway" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Payment Options" minCardinality="1" maxCardinality="1">
                        <groups maxCardinality="3">
                          <childFeatures name="Payment Types" minCardinality="1" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="9">
                              <childFeatures name="COD" maxCardinality="1"/>
                              <childFeatures name="Credit Card" maxCardinality="1"/>
                              <childFeatures name="Debit Card" maxCardinality="1"/>
                              <childFeatures name="Electronic Checque" maxCardinality="1"/>
                              <childFeatures name="Fax Mail Order" maxCardinality="1"/>
                              <childFeatures name="Purchase Order" maxCardinality="1"/>
                              <childFeatures name="Gift Certificate" maxCardinality="1"/>
                              <childFeatures name="Phone Order" maxCardinality="1"/>
                              <childFeatures name="Custom Payment Type" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Fraud Detection" maxCardinality="1"/>
                          <childFeatures name="Payment Gateways" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="7">
                              <childFeatures name="Authorize.Net" maxCardinality="1"/>
                              <childFeatures name="CyberSource" maxCardinality="1"/>
                              <childFeatures name="LinkPoint" maxCardinality="1"/>
                              <childFeatures name="Paradata" maxCardinality="1"/>
                              <childFeatures name="SkipJack" maxCardinality="1"/>
                              <childFeatures name="Verisign Payflow Pro" maxCardinality="1"/>
                              <childFeatures name="Custom Payment Gateway" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                        </groups>
                      </childFeatures>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Order Confirmation" minCardinality="1" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="4">
                      <childFeatures name="Electronic Page" maxCardinality="1"/>
                      <childFeatures name="E-mail" maxCardinality="1"/>
                      <childFeatures name="Phone" maxCardinality="1"/>
                      <childFeatures name="Mail" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                </groups>
              </childFeatures>
              <childFeatures name="Catalog" minCardinality="1" maxCardinality="1">
                <groups maxCardinality="5">
                  <childFeatures name="Searching" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="2">
                      <childFeatures name="Basic Search" maxCardinality="1"/>
                      <childFeatures name="Advanced Search" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Browsing" minCardinality="1" maxCardinality="1">
                    <groups maxCardinality="3">
                      <childFeatures name="Product Page" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Category Page" maxCardinality="1"/>
                      <childFeatures name="Index Page" maxCardinality="1">
                        <groups maxCardinality="1">
                          <childFeatures name="Sorting Filters" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="5">
                              <childFeatures name="Price" maxCardinality="1"/>
                              <childFeatures name="Quality" maxCardinality="1"/>
                              <childFeatures name="Price-Quality Ratio" maxCardinality="1"/>
                              <childFeatures name="Manufacturer Name" maxCardinality="1"/>
                              <childFeatures name="Custom Filter" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                        </groups>
                      </childFeatures>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Custom Views" maxCardinality="1">
                    <groups maxCardinality="2">
                      <childFeatures name="Seasonal Products View" maxCardinality="1"/>
                      <childFeatures name="Personalized View" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Categories" maxCardinality="1">
                    <groups maxCardinality="2">
                      <childFeatures name="Multilevel" maxCardinality="1"/>
                      <childFeatures name="Multiple Classification" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Product Information" minCardinality="1" maxCardinality="1">
                    <groups maxCardinality="10">
                      <childFeatures name="Basic Information" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Detailed Description" maxCardinality="1"/>
                      <childFeatures name="Warranty Information" maxCardinality="1"/>
                      <childFeatures name="Customer Reviews" maxCardinality="1"/>
                      <childFeatures name="Associated Assets" maxCardinality="1">
                        <groups maxCardinality="2">
                          <childFeatures name="Documents" maxCardinality="1"/>
                          <childFeatures name="Media Files" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="4">
                              <childFeatures name="Image" maxCardinality="1">
                                <groups minCardinality="1" maxCardinality="6">
                                  <childFeatures name="Thumbnail" maxCardinality="1"/>
                                  <childFeatures name="2 DImage" maxCardinality="1"/>
                                  <childFeatures name="3D Image" maxCardinality="1"/>
                                  <childFeatures name="360 Degrees Image" maxCardinality="1"/>
                                  <childFeatures name="Different Perspectives" maxCardinality="1"/>
                                  <childFeatures name="Galery" maxCardinality="1"/>
                                </groups>
                              </childFeatures>
                              <childFeatures name="Video" maxCardinality="1"/>
                              <childFeatures name="Sound" maxCardinality="1"/>
                              <childFeatures maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Product Type" minCardinality="1" maxCardinality="1">
                        <groups minCardinality="1" maxCardinality="3">
                          <childFeatures name="Electronic Goods" maxCardinality="1"/>
                          <childFeatures name="Services" maxCardinality="1"/>
                          <childFeatures name="Physical Goods" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Size" maxCardinality="1"/>
                      <childFeatures name="Weight" maxCardinality="1"/>
                      <childFeatures name="Availability" maxCardinality="1"/>
                      <childFeatures name="Custom Fields" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                </groups>
              </childFeatures>
              <childFeatures name="Registration" maxCardinality="1">
                <groups maxCardinality="3">
                  <childFeatures name="RegistrationEnforcement" minCardinality="1" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="3">
                      <childFeatures name="Register to Browse" maxCardinality="1"/>
                      <childFeatures name="Register to Buy" maxCardinality="1"/>
                      <childFeatures name="None" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="RegistrationInformation" minCardinality="1" maxCardinality="1">
                    <groups maxCardinality="10">
                      <childFeatures name="Login Credentials" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Shipping Address" maxCardinality="1">
                        <groups maxCardinality="1">
                          <childFeatures name="Multiple Shipping Addresses" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Billing Address" maxCardinality="1">
                        <groups maxCardinality="1">
                          <childFeatures name="Multiple Billing Addresses" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Credit Card Information" maxCardinality="1">
                        <groups maxCardinality="4">
                          <childFeatures name="Cardholder Name" minCardinality="1" maxCardinality="1"/>
                          <childFeatures name="Card Number" minCardinality="1" maxCardinality="1"/>
                          <childFeatures name="Expiry Date" minCardinality="1" maxCardinality="1"/>
                          <childFeatures name="Security Information" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Demographics" maxCardinality="1">
                        <groups minCardinality="1" maxCardinality="4">
                          <childFeatures name="Age" maxCardinality="1"/>
                          <childFeatures name="Income" maxCardinality="1"/>
                          <childFeatures name="Education" maxCardinality="1"/>
                          <childFeatures name="Custom Demographic Field" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Personal Information" maxCardinality="1"/>
                      <childFeatures name="Preferences" maxCardinality="1">
                        <groups minCardinality="1" maxCardinality="3">
                          <childFeatures name="Site Layout" maxCardinality="1"/>
                          <childFeatures name="List Size" maxCardinality="1"/>
                          <childFeatures name="Language" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Reminders" maxCardinality="1"/>
                      <childFeatures name="Quick Checkout Profile" maxCardinality="1"/>
                      <childFeatures name="Custom Fields" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="User Behaviour Tracking Information" maxCardinality="1"/>
                </groups>
              </childFeatures>
              <childFeatures name="Wish Lists" maxCardinality="1">
                <groups maxCardinality="5">
                  <childFeatures name="Wish List Saved After Session" maxCardinality="1"/>
                  <childFeatures name="E-mail Wish List" maxCardinality="1"/>
                  <childFeatures name="Multiple Wish Lists" maxCardinality="1"/>
                  <childFeatures name="Automatic Update" maxCardinality="1"/>
                  <childFeatures name="Permissions" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="3">
                      <childFeatures name="Public Access" maxCardinality="1"/>
                      <childFeatures name="Restricted Access" maxCardinality="1"/>
                      <childFeatures name="Private Access" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                </groups>
              </childFeatures>
              <childFeatures name="HomePage" minCardinality="1" maxCardinality="1">
                <groups maxCardinality="2">
                  <childFeatures name="Static Content" maxCardinality="1"/>
                  <childFeatures name="Dynamic Content" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="2">
                      <childFeatures name="TimeDependent" maxCardinality="1"/>
                      <childFeatures name="Personalized" maxCardinality="1"/>
                    </groups>
                    <groups maxCardinality="1">
                      <childFeatures name="Content Type" maxCardinality="1">
                        <groups minCardinality="1" maxCardinality="2">
                          <childFeatures name="Welcome Message" maxCardinality="1"/>
                          <childFeatures name="Special Offers" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                    </groups>
                  </childFeatures>
                </groups>
              </childFeatures>
              <childFeatures name="BuyPath" minCardinality="1" maxCardinality="1"/>
              <childFeatures name="CustomerService" maxCardinality="1">
                <groups minCardinality="1" maxCardinality="3">
                  <childFeatures name="Question and Feedback Forms" maxCardinality="1">
                    <groups maxCardinality="1">
                      <childFeatures name="Question and Feedback Tracking" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Product Returns" maxCardinality="1"/>
                  <childFeatures name="Order Status Viewing" maxCardinality="1">
                    <groups maxCardinality="2">
                      <childFeatures name="Filtering Criteria" minCardinality="1" maxCardinality="1">
                        <groups minCardinality="1" maxCardinality="3">
                          <childFeatures name="Order Number" maxCardinality="1"/>
                          <childFeatures name="Order Date" maxCardinality="1"/>
                          <childFeatures name="Order Status" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Request Order Hardcopy" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Shipment Status Tracking" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="2">
                      <childFeatures name="Internal Tracking" maxCardinality="1"/>
                      <childFeatures name="Partner Tracking" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                </groups>
              </childFeatures>
              <childFeatures name="UserBehaviourTracking" maxCardinality="1">
                <groups maxCardinality="1">
                  <childFeatures name="Behaviour Tracked" minCardinality="1" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="3">
                      <childFeatures name="Locally Visited Pages" maxCardinality="1"/>
                      <childFeatures name="External Referring Pages" maxCardinality="1"/>
                      <childFeatures name="Previous Purchases" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                </groups>
              </childFeatures>
            </groups>
          </childFeatures>
          <childFeatures name="Business Management" minCardinality="1" maxCardinality="1">
            <groups maxCardinality="8">
              <childFeatures name="Order Management" minCardinality="1" maxCardinality="1">
                <groups maxCardinality="1">
                  <childFeatures name="Fulfillment" minCardinality="1" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="3">
                      <childFeatures name="Physical Goods Fulfillment" maxCardinality="1">
                        <groups maxCardinality="2">
                          <childFeatures name="WarehouseManagement" minCardinality="1" maxCardinality="1"/>
                          <childFeatures name="Shipping" minCardinality="1" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="2">
                              <childFeatures name="Custom Shipping Method" maxCardinality="1">
                                <groups maxCardinality="1">
                                  <childFeatures name="Pricing" minCardinality="1" maxCardinality="1">
                                    <groups maxCardinality="2">
                                      <childFeatures name="Flat Rate" minCardinality="1" maxCardinality="1"/>
                                      <childFeatures name="Rate Factors" maxCardinality="1">
                                        <groups minCardinality="1" maxCardinality="4">
                                          <childFeatures name="Quantity Purchased" maxCardinality="1"/>
                                          <childFeatures name="Order Total" maxCardinality="1"/>
                                          <childFeatures name="Weight" maxCardinality="1"/>
                                          <childFeatures name="Product Classification" maxCardinality="1"/>
                                        </groups>
                                      </childFeatures>
                                    </groups>
                                  </childFeatures>
                                </groups>
                              </childFeatures>
                              <childFeatures name="Shipping Gateways" maxCardinality="1">
                                <groups minCardinality="1" maxCardinality="5">
                                  <childFeatures name="FedEx" maxCardinality="1"/>
                                  <childFeatures name="UPS" maxCardinality="1"/>
                                  <childFeatures name="USPS" maxCardinality="1"/>
                                  <childFeatures name="CanadaPost" maxCardinality="1"/>
                                  <childFeatures name="Suctom Shipping Gateway" maxCardinality="1"/>
                                </groups>
                              </childFeatures>
                            </groups>
                          </childFeatures>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Electronic Goods Fulfillment" maxCardinality="1">
                        <groups maxCardinality="2">
                          <childFeatures name="File Repository" minCardinality="1" maxCardinality="1"/>
                          <childFeatures name="Licence Management" minCardinality="1" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Services Fulfillment" maxCardinality="1">
                        <groups maxCardinality="2">
                          <childFeatures name="Appointment Scheduling" maxCardinality="1"/>
                          <childFeatures name="Resource Planning" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                    </groups>
                  </childFeatures>
                </groups>
              </childFeatures>
              <childFeatures name="Inventory Tracking" maxCardinality="1">
                <groups maxCardinality="1">
                  <childFeatures name="Allow Backorders" maxCardinality="1"/>
                </groups>
              </childFeatures>
              <childFeatures name="Targeting" maxCardinality="1">
                <groups maxCardinality="4">
                  <childFeatures name="Targeting Criteria" minCardinality="1" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="9">
                      <childFeatures name="Customer Preferences" maxCardinality="1"/>
                      <childFeatures name="Personal Information" maxCardinality="1"/>
                      <childFeatures name="Demographics" maxCardinality="1"/>
                      <childFeatures name="Previous Purchases" maxCardinality="1"/>
                      <childFeatures name="Shopping Cart Content" maxCardinality="1"/>
                      <childFeatures name="Wish List Content" maxCardinality="1"/>
                      <childFeatures name="Previously Visited Pages" maxCardinality="1"/>
                      <childFeatures name="Date and Time" maxCardinality="1"/>
                      <childFeatures name="Custom Targeting Criteria" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Targeting Mechanisms" minCardinality="1" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="3">
                      <childFeatures name="Advertisements" maxCardinality="1">
                        <groups maxCardinality="4">
                          <childFeatures name="Advertisement Types" minCardinality="1" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="2">
                              <childFeatures name="Banner Ads" maxCardinality="1"/>
                              <childFeatures name="Pop-up Ads" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Advertisement Sources" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="2">
                              <childFeatures name="House Advertisements" maxCardinality="1"/>
                              <childFeatures name="Paid Advertisements" maxCardinality="1">
                                <groups maxCardinality="1">
                                  <childFeatures name="Advertisement Management Interface" minCardinality="1" maxCardinality="1"/>
                                </groups>
                              </childFeatures>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Advertisement Response Tracking" maxCardinality="1"/>
                          <childFeatures name="Context Sensitive Ads" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Discounts" maxCardinality="1">
                        <groups maxCardinality="6">
                          <childFeatures name="Discount Conditions" minCardinality="1" maxCardinality="1">
                            <groups maxCardinality="3">
                              <childFeatures name="Product and Quantity Scope" minCardinality="1" maxCardinality="1"/>
                              <childFeatures name="Time Scope" minCardinality="1" maxCardinality="1"/>
                              <childFeatures name="Purchase Value Scope" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Award" minCardinality="1" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="3">
                              <childFeatures name="Percentage Discount" maxCardinality="1"/>
                              <childFeatures name="Fixed Discount" maxCardinality="1"/>
                              <childFeatures name="Free Item" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Eligibility Requirements" minCardinality="1" maxCardinality="1">
                            <groups maxCardinality="2">
                              <childFeatures name="Customer Segments" maxCardinality="1"/>
                              <childFeatures name="Shipping Address" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Graduation By" minCardinality="1" maxCardinality="1">
                            <groups minCardinality="1" maxCardinality="2">
                              <childFeatures name="Purchase Value" maxCardinality="1"/>
                              <childFeatures name="Quantity" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Coupons" maxCardinality="1"/>
                          <childFeatures name="Handling Multiple Discounts" minCardinality="1" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                      <childFeatures name="Sell Strategies" maxCardinality="1">
                        <groups maxCardinality="3">
                          <childFeatures name="Product Kitting" maxCardinality="1"/>
                          <childFeatures name="Up-Seiling" maxCardinality="1">
                            <groups maxCardinality="1">
                              <childFeatures name="Substitute Products" minCardinality="1" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                          <childFeatures name="Cross-Seiling" maxCardinality="1">
                            <groups maxCardinality="1">
                              <childFeatures name="Past Customers Also Bought" minCardinality="1" maxCardinality="1"/>
                            </groups>
                          </childFeatures>
                        </groups>
                      </childFeatures>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Display and Notification" minCardinality="1" maxCardinality="1">
                    <groups minCardinality="1" maxCardinality="3">
                      <childFeatures name="Assignment to Page Types for Display" maxCardinality="1"/>
                      <childFeatures name="Product Flagging" maxCardinality="1"/>
                      <childFeatures name="E-mails" maxCardinality="1">
                        <groups maxCardinality="2">
                          <childFeatures name="Personalized" maxCardinality="1"/>
                          <childFeatures name="Response Tracking" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Campaigns" maxCardinality="1"/>
                </groups>
              </childFeatures>
              <childFeatures name="Affiliates" maxCardinality="1">
                <groups maxCardinality="2">
                  <childFeatures name="Affiliate Registration" minCardinality="1" maxCardinality="1"/>
                  <childFeatures name="Commission Tracking" minCardinality="1" maxCardinality="1"/>
                </groups>
              </childFeatures>
              <childFeatures name="Procurement" maxCardinality="1">
                <groups maxCardinality="1">
                  <childFeatures name="Stock Replenishment" minCardinality="1" maxCardinality="1">
                    <groups maxCardinality="2">
                      <childFeatures name="Manual" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Automatic" maxCardinality="1">
                        <groups maxCardinality="1">
                          <childFeatures name="Non-Repudiation Service" maxCardinality="1"/>
                        </groups>
                      </childFeatures>
                    </groups>
                  </childFeatures>
                </groups>
              </childFeatures>
              <childFeatures name="Reporting and Analysis" maxCardinality="1">
                <groups maxCardinality="3">
                  <childFeatures name="Report Types" minCardinality="1" maxCardinality="1"/>
                  <childFeatures name="Report Formats" minCardinality="1" maxCardinality="1"/>
                  <childFeatures name="Level of Detail" minCardinality="1" maxCardinality="1"/>
                </groups>
              </childFeatures>
              <childFeatures name="External Systems Integration" maxCardinality="1">
                <groups minCardinality="1" maxCardinality="4">
                  <childFeatures name="Fulfillment System" maxCardinality="1"/>
                  <childFeatures name="Inventory Management System" maxCardinality="1"/>
                  <childFeatures name="Procurement System" maxCardinality="1"/>
                  <childFeatures name="External Distributor System" maxCardinality="1"/>
                </groups>
              </childFeatures>
              <childFeatures name="Administration" minCardinality="1" maxCardinality="1">
                <groups maxCardinality="2">
                  <childFeatures name="Content Management" minCardinality="1" maxCardinality="1">
                    <groups maxCardinality="4">
                      <childFeatures name="Product Database Management" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Presentation Options" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="General Layout Management" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Content Approval" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                  <childFeatures name="Store Administration" minCardinality="1" maxCardinality="1">
                    <groups maxCardinality="3">
                      <childFeatures name="Site Search" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Search Engine Registration" minCardinality="1" maxCardinality="1"/>
                      <childFeatures name="Domain Name Setup" minCardinality="1" maxCardinality="1"/>
                    </groups>
                  </childFeatures>
                </groups>
              </childFeatures>
            </groups>
          </childFeatures>
        </groups>
      </childFeatures>
    </groups>
  </root>
</feature:FeatureModel>
