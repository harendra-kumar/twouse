<?xml version="1.0" encoding="UTF-8"?>
<feature:FeatureModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:feature="http://www.tudresden.de/feature" name="Eshop">
  <root name="Eshop">
    <groups maxCardinality="2">
      <childFeatures name="Store Front" minCardinality="1" maxCardinality="1">
        <groups maxCardinality="3">
          <childFeatures name="Catalog" minCardinality="1" maxCardinality="1">
            <groups maxCardinality="3">
              <childFeatures name="ProductVariants" maxCardinality="1">
                <groups maxCardinality="1">
                  <childFeatures name="Complex Product Configuration" maxCardinality="1"/>
                </groups>
              </childFeatures>
              <childFeatures name="Searching" maxCardinality="1">
                <groups minCardinality="1" maxCardinality="1">
                  <childFeatures name="Basic Search" maxCardinality="1"/>
                  <childFeatures name="Advanced Search" maxCardinality="1"/>
                </groups>
              </childFeatures>
              <childFeatures name="Categories" maxCardinality="1">
                <groups maxCardinality="2">
                  <childFeatures name="Multilevel" maxCardinality="1"/>
                  <childFeatures name="Multiple Classification" maxCardinality="1"/>
                </groups>
              </childFeatures>
            </groups>
          </childFeatures>
          <childFeatures name="WishList" maxCardinality="1">
            <groups maxCardinality="2">
              <childFeatures name="Wish List Saved After Session" maxCardinality="1"/>
              <childFeatures name="Multiple Wish Lists" maxCardinality="1"/>
            </groups>
          </childFeatures>
          <childFeatures name="Registration" maxCardinality="1"/>
        </groups>
      </childFeatures>
      <childFeatures name="Business Management" minCardinality="1" maxCardinality="1">
        <groups maxCardinality="1">
          <childFeatures name="Targeting" maxCardinality="1">
            <groups maxCardinality="1">
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
            </groups>
          </childFeatures>
        </groups>
      </childFeatures>
    </groups>
  </root>
</feature:FeatureModel>
