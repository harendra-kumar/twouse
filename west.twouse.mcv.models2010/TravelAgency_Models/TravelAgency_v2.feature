<?xml version="1.0" encoding="UTF-8"?>
<feature:FeatureModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:feature="http://www.tudresden.de/feature">
  <root name="TravelAgency" minCardinality="1" maxCardinality="1">
    <groups minCardinality="1" maxCardinality="1">
      <childFeatures name="Payment" minCardinality="1" maxCardinality="1">
        <groups minCardinality="1" maxCardinality="1">
          <childFeatures name="FraudDetection" maxCardinality="1"/>
        </groups>
        <groups maxCardinality="3">
          <childFeatures name="Cheque" maxCardinality="1"/>
          <childFeatures name="Cash" maxCardinality="1"/>
          <childFeatures name="CreditCard" maxCardinality="1"/>
        </groups>
      </childFeatures>
    </groups>
    <groups minCardinality="1" maxCardinality="1">
      <childFeatures name="Delivery" minCardinality="1" maxCardinality="1">
        <groups minCardinality="1" maxCardinality="1">
          <childFeatures name="Notification" minCardinality="1" maxCardinality="1"/>
        </groups>
        <groups maxCardinality="3">
          <childFeatures name="Personal" maxCardinality="1"/>
          <childFeatures name="Post" maxCardinality="1"/>
          <childFeatures name="Collection" maxCardinality="1"/>
        </groups>
      </childFeatures>
    </groups>
    <groups minCardinality="1" maxCardinality="1">
      <childFeatures name="Insurance" maxCardinality="1">
        <groups maxCardinality="4">
          <childFeatures name="Health" maxCardinality="1"/>
          <childFeatures name="Damage" maxCardinality="1"/>
          <childFeatures name="Traveling" maxCardinality="1"/>
          <childFeatures name="Loss" maxCardinality="1"/>
        </groups>
      </childFeatures>
    </groups>
  </root>
</feature:FeatureModel>
