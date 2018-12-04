[pbarate@pbarate resources]$ keytool -genkey -keyalg RSA -alias linkedin -keystore keystore.jks -storepass password -validity 4000 -keysize 2048
What is your first and last name?
  [Unknown]:  Pravin Barate
What is the name of your organizational unit?
  [Unknown]:  Red hat
What is the name of your organization?
  [Unknown]:  redhat.com
What is the name of your City or Locality?
  [Unknown]:  Pune
What is the name of your State or Province?
  [Unknown]:  MH
What is the two-letter country code for this unit?
  [Unknown]:  IN
Is CN=Pravin Barate, OU=Red hat, O=redhat.com, L=Pune, ST=MH, C=IN correct?
  [no]:  yes

Enter key password for <linkedin>
	(RETURN if same as keystore password):  

Warning:
The JKS keystore uses a proprietary format. It is recommended to migrate to PKCS12 which is an industry standard format using "keytool -importkeystore -srckeystore keystore.jks -destkeystore keystore.jks -deststoretype pkcs12".
[pbarate@pbarate resources]$ 
