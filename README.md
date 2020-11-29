# COVID19Tracker
 
This application returns a countrywise list of no. of covid cases detected on the previous day. Response type is json with the following structure:

```[
   {
     "country": "",
     "state": "",
     "cases": ""
   },
   {
     "country": "",
     "state": "",
     "cases": ""
   },
   {
     "country": "",
     "state": "",
     "cases": ""
   },
   {
     "country": "",
     "state": "",
     "cases": ""
   },
   .
   .
   .
 ]
```
## How to install
To build this Spring boot application, clone the branch to your local environment and run the following command in the project directory:

```mvn clean install```

This command will create a `COVID19Tracker-0.0.1-SNAPSHOT.jar`

To start the application, switch to the directory where jar file is located, and run the following command:

`java -jar COVID19Tracker-0.0.1-SNAPSHOT.jar`

## Sample Request & Response

### Sample Request

`GET http://localhost:8080/Covid19Tracker/getCurrentStats`

### Sample Response

```
[
  {
    "country": "Afghanistan",
    "state": "",
    "cases": "45839"
  },
  {
    "country": "Albania",
    "state": "",
    "cases": "36245"
  },
  {
    "country": "Algeria",
    "state": "",
    "cases": "80168"
  },
  {
    "country": "Andorra",
    "state": "",
    "cases": "6610"
  },
  {
    "country": "Angola",
    "state": "",
    "cases": "15008"
  },
  {
    "country": "Antigua and Barbuda",
    "state": "",
    "cases": "141"
  },
  {
    "country": "Argentina",
    "state": "",
    "cases": "1407277"
  },
  {
    "country": "Armenia",
    "state": "",
    "cases": "132346"
  },
  {
    "country": "Australia",
    "state": "Australian Capital Territory",
    "cases": "117"
  },
  {
    "country": "Australia",
    "state": "New South Wales",
    "cases": "4564"
  },
  {
    "country": "Australia",
    "state": "Northern Territory",
    "cases": "52"
  },
  {
    "country": "Australia",
    "state": "Queensland",
    "cases": "1199"
  },
  {
    "country": "Australia",
    "state": "South Australia",
    "cases": "562"
  },
  {
    "country": "Australia",
    "state": "Tasmania",
    "cases": "230"
  },
  {
    "country": "Australia",
    "state": "Victoria",
    "cases": "20345"
  },
  {
    "country": "Australia",
    "state": "Western Australia",
    "cases": "817"
  },
  {
    "country": "Austria",
    "state": "",
    "cases": "270992"
  },
  {
    "country": "Azerbaijan",
    "state": "",
    "cases": "109813"
  },
  {
    "country": "Bahamas",
    "state": "",
    "cases": "7496"
  },
  {
    "country": "Bahrain",
    "state": "",
    "cases": "86515"
  },
  {
    "country": "Bangladesh",
    "state": "",
    "cases": "458711"
  },
  {
    "country": "Barbados",
    "state": "",
    "cases": "270"
  },
  {
    "country": "Belarus",
    "state": "",
    "cases": "131633"
  },
  {
    "country": "Belgium",
    "state": "",
    "cases": "570829"
  },
  {
    "country": "Belize",
    "state": "",
    "cases": "5587"
  },
  {
    "country": "Benin",
    "state": "",
    "cases": "2974"
  },
  {
    "country": "Bhutan",
    "state": "",
    "cases": "395"
  },
  {
    "country": "Bolivia",
    "state": "",
    "cases": "144494"
  },
  {
    "country": "Bosnia and Herzegovina",
    "state": "",
    "cases": "85431"
  },
  {
    "country": "Botswana",
    "state": "",
    "cases": "10258"
  },
  {
    "country": "Brazil",
    "state": "",
    "cases": "6238350"
  },
  {
    "country": "Brunei",
    "state": "",
    "cases": "150"
  },
  {
    "country": "Bulgaria",
    "state": "",
    "cases": "139955"
  },
  {
    "country": "Burkina Faso",
    "state": "",
    "cases": "2816"
  },
  {
    "country": "Burma",
    "state": "",
    "cases": "86633"
  },
  {
    "country": "Burundi",
    "state": "",
    "cases": "681"
  },
  {
    "country": "Cabo Verde",
    "state": "",
    "cases": "10626"
  },
  {
    "country": "Cambodia",
    "state": "",
    "cases": "308"
  },
  {
    "country": "Cameroon",
    "state": "",
    "cases": "24117"
  },
  {
    "country": "Canada",
    "state": "Alberta",
    "cases": "53105"
  },
  {
    "country": "Canada",
    "state": "British Columbia",
    "cases": "30884"
  },
  {
    "country": "Canada",
    "state": "Diamond Princess",
    "cases": "0"
  },
  {
    "country": "Canada",
    "state": "Grand Princess",
    "cases": "13"
  },
  {
    "country": "Canada",
    "state": "Manitoba",
    "cases": "15632"
  },
  {
    "country": "Canada",
    "state": "New Brunswick",
    "cases": "477"
  },
  {
    "country": "Canada",
    "state": "Newfoundland and Labrador",
    "cases": "331"
  },
  {
    "country": "Canada",
    "state": "Northwest Territories",
    "cases": "15"
  },
  {
    "country": "Canada",
    "state": "Nova Scotia",
    "cases": "1257"
  },
  {
    "country": "Canada",
    "state": "Nunavut",
    "cases": "159"
  },
  {
    "country": "Canada",
    "state": "Ontario",
    "cases": "114749"
  },
  {
    "country": "Canada",
    "state": "Prince Edward Island",
    "cases": "70"
  },
  {
    "country": "Canada",
    "state": "Quebec",
    "cases": "138163"
  },
  {
    "country": "Canada",
    "state": "Repatriated Travellers",
    "cases": "13"
  },
  {
    "country": "Canada",
    "state": "Saskatchewan",
    "cases": "7691"
  },
  {
    "country": "Canada",
    "state": "Yukon",
    "cases": "45"
  },
  {
    "country": "Central African Republic",
    "state": "",
    "cases": "4913"
  },
  {
    "country": "Chad",
    "state": "",
    "cases": "1663"
  },
  {
    "country": "Chile",
    "state": "",
    "cases": "547243"
  },
  {
    "country": "China",
    "state": "Anhui",
    "cases": "992"
  },
  {
    "country": "China",
    "state": "Beijing",
    "cases": "950"
  },
  {
    "country": "China",
    "state": "Chongqing",
    "cases": "590"
  },
  {
    "country": "China",
    "state": "Fujian",
    "cases": "483"
  },
  {
    "country": "China",
    "state": "Gansu",
    "cases": "181"
  },
  {
    "country": "China",
    "state": "Guangdong",
    "cases": "1988"
  },
  {
    "country": "China",
    "state": "Guangxi",
    "cases": "263"
  },
  {
    "country": "China",
    "state": "Guizhou",
    "cases": "147"
  },
  {
    "country": "China",
    "state": "Hainan",
    "cases": "171"
  },
  {
    "country": "China",
    "state": "Hebei",
    "cases": "373"
  },
  {
    "country": "China",
    "state": "Heilongjiang",
    "cases": "949"
  },
  {
    "country": "China",
    "state": "Henan",
    "cases": "1289"
  },
  {
    "country": "China",
    "state": "Hong Kong",
    "cases": "6039"
  },
  {
    "country": "China",
    "state": "Hubei",
    "cases": "68148"
  },
  {
    "country": "China",
    "state": "Hunan",
    "cases": "1020"
  },
  {
    "country": "China",
    "state": "Inner Mongolia",
    "cases": "320"
  },
  {
    "country": "China",
    "state": "Jiangsu",
    "cases": "680"
  },
  {
    "country": "China",
    "state": "Jiangxi",
    "cases": "935"
  },
  {
    "country": "China",
    "state": "Jilin",
    "cases": "157"
  },
  {
    "country": "China",
    "state": "Liaoning",
    "cases": "289"
  },
  {
    "country": "China",
    "state": "Macau",
    "cases": "46"
  },
  {
    "country": "China",
    "state": "Ningxia",
    "cases": "75"
  },
  {
    "country": "China",
    "state": "Qinghai",
    "cases": "18"
  },
  {
    "country": "China",
    "state": "Shaanxi",
    "cases": "497"
  },
  {
    "country": "China",
    "state": "Shandong",
    "cases": "849"
  },
  {
    "country": "China",
    "state": "Shanghai",
    "cases": "1322"
  },
  {
    "country": "China",
    "state": "Shanxi",
    "cases": "220"
  },
  {
    "country": "China",
    "state": "Sichuan",
    "cases": "802"
  },
  {
    "country": "China",
    "state": "Tianjin",
    "cases": "300"
  },
  {
    "country": "China",
    "state": "Tibet",
    "cases": "1"
  },
  {
    "country": "China",
    "state": "Xinjiang",
    "cases": "980"
  },
  {
    "country": "China",
    "state": "Yunnan",
    "cases": "218"
  },
  {
    "country": "China",
    "state": "Zhejiang",
    "cases": "1294"
  },
  {
    "country": "Colombia",
    "state": "",
    "cases": "1290510"
  },
  {
    "country": "Comoros",
    "state": "",
    "cases": "610"
  },
  {
    "country": "Congo (Brazzaville)",
    "state": "",
    "cases": "5774"
  },
  {
    "country": "Congo (Kinshasa)",
    "state": "",
    "cases": "12470"
  },
  {
    "country": "Costa Rica",
    "state": "",
    "cases": "137093"
  },
  {
    "country": "Cote d'Ivoire",
    "state": "",
    "cases": "21232"
  },
  {
    "country": "Croatia",
    "state": "",
    "cases": "119706"
  },
  {
    "country": "Cuba",
    "state": "",
    "cases": "8110"
  },
  {
    "country": "Cyprus",
    "state": "",
    "cases": "9983"
  },
  {
    "country": "Czechia",
    "state": "",
    "cases": "515984"
  },
  {
    "country": "Denmark",
    "state": "Faroe Islands",
    "cases": "500"
  },
  {
    "country": "Denmark",
    "state": "Greenland",
    "cases": "18"
  },
  {
    "country": "Denmark",
    "state": "",
    "cases": "76718"
  },
  {
    "country": "Diamond Princess",
    "state": "",
    "cases": "712"
  },
  {
    "country": "Djibouti",
    "state": "",
    "cases": "5676"
  },
  {
    "country": "Dominica",
    "state": "",
    "cases": "80"
  },
  {
    "country": "Dominican Republic",
    "state": "",
    "cases": "141777"
  },
  {
    "country": "Ecuador",
    "state": "",
    "cases": "189534"
  },
  {
    "country": "Egypt",
    "state": "",
    "cases": "114832"
  },
  {
    "country": "El Salvador",
    "state": "",
    "cases": "38405"
  },
  {
    "country": "Equatorial Guinea",
    "state": "",
    "cases": "5146"
  },
  {
    "country": "Eritrea",
    "state": "",
    "cases": "566"
  },
  {
    "country": "Estonia",
    "state": "",
    "cases": "11323"
  },
  {
    "country": "Eswatini",
    "state": "",
    "cases": "6362"
  },
  {
    "country": "Ethiopia",
    "state": "",
    "cases": "108438"
  },
  {
    "country": "Fiji",
    "state": "",
    "cases": "38"
  },
  {
    "country": "Finland",
    "state": "",
    "cases": "23766"
  },
  {
    "country": "France",
    "state": "French Guiana",
    "cases": "11158"
  },
  {
    "country": "France",
    "state": "French Polynesia",
    "cases": "14096"
  },
  {
    "country": "France",
    "state": "Guadeloupe",
    "cases": "8344"
  },
  {
    "country": "France",
    "state": "Martinique",
    "cases": "5413"
  },
  {
    "country": "France",
    "state": "Mayotte",
    "cases": "5181"
  },
  {
    "country": "France",
    "state": "New Caledonia",
    "cases": "32"
  },
  {
    "country": "France",
    "state": "Reunion",
    "cases": "7940"
  },
  {
    "country": "France",
    "state": "Saint Barthelemy",
    "cases": "127"
  },
  {
    "country": "France",
    "state": "Saint Pierre and Miquelon",
    "cases": "16"
  },
  {
    "country": "France",
    "state": "St Martin",
    "cases": "690"
  },
  {
    "country": "France",
    "state": "",
    "cases": "2195212"
  },
  {
    "country": "Gabon",
    "state": "",
    "cases": "9191"
  },
  {
    "country": "Gambia",
    "state": "",
    "cases": "3731"
  },
  {
    "country": "Georgia",
    "state": "",
    "cases": "123470"
  },
  {
    "country": "Germany",
    "state": "",
    "cases": "1038649"
  },
  {
    "country": "Ghana",
    "state": "",
    "cases": "51225"
  },
  {
    "country": "Greece",
    "state": "",
    "cases": "101287"
  },
  {
    "country": "Grenada",
    "state": "",
    "cases": "41"
  },
  {
    "country": "Guatemala",
    "state": "",
    "cases": "121132"
  },
  {
    "country": "Guinea",
    "state": "",
    "cases": "13039"
  },
  {
    "country": "Guinea-Bissau",
    "state": "",
    "cases": "2422"
  },
  {
    "country": "Guyana",
    "state": "",
    "cases": "5310"
  },
  {
    "country": "Haiti",
    "state": "",
    "cases": "9264"
  },
  {
    "country": "Holy See",
    "state": "",
    "cases": "27"
  },
  {
    "country": "Honduras",
    "state": "",
    "cases": "107134"
  },
  {
    "country": "Hungary",
    "state": "",
    "cases": "198440"
  },
  {
    "country": "Iceland",
    "state": "",
    "cases": "5346"
  },
  {
    "country": "India",
    "state": "",
    "cases": "9351109"
  },
  {
    "country": "Indonesia",
    "state": "",
    "cases": "522581"
  },
  {
    "country": "Iran",
    "state": "",
    "cases": "922397"
  },
  {
    "country": "Iraq",
    "state": "",
    "cases": "547215"
  },
  {
    "country": "Ireland",
    "state": "",
    "cases": "71699"
  },
  {
    "country": "Israel",
    "state": "",
    "cases": "333802"
  },
  {
    "country": "Italy",
    "state": "",
    "cases": "1538217"
  },
  {
    "country": "Jamaica",
    "state": "",
    "cases": "10600"
  },
  {
    "country": "Japan",
    "state": "",
    "cases": "142778"
  },
  {
    "country": "Jordan",
    "state": "",
    "cases": "207601"
  },
  {
    "country": "Kazakhstan",
    "state": "",
    "cases": "130039"
  },
  {
    "country": "Kenya",
    "state": "",
    "cases": "81656"
  },
  {
    "country": "Korea, South",
    "state": "",
    "cases": "33375"
  },
  {
    "country": "Kosovo",
    "state": "",
    "cases": "37792"
  },
  {
    "country": "Kuwait",
    "state": "",
    "cases": "141876"
  },
  {
    "country": "Kyrgyzstan",
    "state": "",
    "cases": "71548"
  },
  {
    "country": "Laos",
    "state": "",
    "cases": "39"
  },
  {
    "country": "Latvia",
    "state": "",
    "cases": "15808"
  },
  {
    "country": "Lebanon",
    "state": "",
    "cases": "123982"
  },
  {
    "country": "Lesotho",
    "state": "",
    "cases": "2109"
  },
  {
    "country": "Liberia",
    "state": "",
    "cases": "1595"
  },
  {
    "country": "Libya",
    "state": "",
    "cases": "81273"
  },
  {
    "country": "Liechtenstein",
    "state": "",
    "cases": "1231"
  },
  {
    "country": "Lithuania",
    "state": "",
    "cases": "56095"
  },
  {
    "country": "Luxembourg",
    "state": "",
    "cases": "33409"
  },
  {
    "country": "MS Zaandam",
    "state": "",
    "cases": "9"
  },
  {
    "country": "Madagascar",
    "state": "",
    "cases": "17341"
  },
  {
    "country": "Malawi",
    "state": "",
    "cases": "6024"
  },
  {
    "country": "Malaysia",
    "state": "",
    "cases": "61861"
  },
  {
    "country": "Maldives",
    "state": "",
    "cases": "12933"
  },
  {
    "country": "Mali",
    "state": "",
    "cases": "4567"
  },
  {
    "country": "Malta",
    "state": "",
    "cases": "9501"
  },
  {
    "country": "Marshall Islands",
    "state": "",
    "cases": "4"
  },
  {
    "country": "Mauritania",
    "state": "",
    "cases": "8424"
  },
  {
    "country": "Mauritius",
    "state": "",
    "cases": "501"
  },
  {
    "country": "Mexico",
    "state": "",
    "cases": "1078594"
  },
  {
    "country": "Moldova",
    "state": "",
    "cases": "104140"
  },
  {
    "country": "Monaco",
    "state": "",
    "cases": "603"
  },
  {
    "country": "Mongolia",
    "state": "",
    "cases": "760"
  },
  {
    "country": "Montenegro",
    "state": "",
    "cases": "33836"
  },
  {
    "country": "Morocco",
    "state": "",
    "cases": "345276"
  },
  {
    "country": "Mozambique",
    "state": "",
    "cases": "15506"
  },
  {
    "country": "Namibia",
    "state": "",
    "cases": "14207"
  },
  {
    "country": "Nepal",
    "state": "",
    "cases": "229343"
  },
  {
    "country": "Netherlands",
    "state": "Aruba",
    "cases": "4808"
  },
  {
    "country": "Netherlands",
    "state": "Bonaire, Sint Eustatius and Saba",
    "cases": "161"
  },
  {
    "country": "Netherlands",
    "state": "Curacao",
    "cases": "2157"
  },
  {
    "country": "Netherlands",
    "state": "Sint Maarten",
    "cases": "1053"
  },
  {
    "country": "Netherlands",
    "state": "",
    "cases": "508866"
  },
  {
    "country": "New Zealand",
    "state": "",
    "cases": "2050"
  },
  {
    "country": "Nicaragua",
    "state": "",
    "cases": "5784"
  },
  {
    "country": "Niger",
    "state": "",
    "cases": "1472"
  },
  {
    "country": "Nigeria",
    "state": "",
    "cases": "67220"
  },
  {
    "country": "North Macedonia",
    "state": "",
    "cases": "59701"
  },
  {
    "country": "Norway",
    "state": "",
    "cases": "35193"
  },
  {
    "country": "Oman",
    "state": "",
    "cases": "122579"
  },
  {
    "country": "Pakistan",
    "state": "",
    "cases": "392356"
  },
  {
    "country": "Panama",
    "state": "",
    "cases": "161744"
  },
  {
    "country": "Papua New Guinea",
    "state": "",
    "cases": "645"
  },
  {
    "country": "Paraguay",
    "state": "",
    "cases": "80436"
  },
  {
    "country": "Peru",
    "state": "",
    "cases": "956347"
  },
  {
    "country": "Philippines",
    "state": "",
    "cases": "425918"
  },
  {
    "country": "Poland",
    "state": "",
    "cases": "958416"
  },
  {
    "country": "Portugal",
    "state": "",
    "cases": "285838"
  },
  {
    "country": "Qatar",
    "state": "",
    "cases": "138250"
  },
  {
    "country": "Romania",
    "state": "",
    "cases": "457848"
  },
  {
    "country": "Russia",
    "state": "",
    "cases": "2196691"
  },
  {
    "country": "Rwanda",
    "state": "",
    "cases": "5872"
  },
  {
    "country": "Saint Kitts and Nevis",
    "state": "",
    "cases": "22"
  },
  {
    "country": "Saint Lucia",
    "state": "",
    "cases": "246"
  },
  {
    "country": "Saint Vincent and the Grenadines",
    "state": "",
    "cases": "85"
  },
  {
    "country": "San Marino",
    "state": "",
    "cases": "1554"
  },
  {
    "country": "Sao Tome and Principe",
    "state": "",
    "cases": "985"
  },
  {
    "country": "Saudi Arabia",
    "state": "",
    "cases": "356691"
  },
  {
    "country": "Senegal",
    "state": "",
    "cases": "15981"
  },
  {
    "country": "Serbia",
    "state": "",
    "cases": "155994"
  },
  {
    "country": "Seychelles",
    "state": "",
    "cases": "173"
  },
  {
    "country": "Sierra Leone",
    "state": "",
    "cases": "2410"
  },
  {
    "country": "Singapore",
    "state": "",
    "cases": "58199"
  },
  {
    "country": "Slovakia",
    "state": "",
    "cases": "103106"
  },
  {
    "country": "Slovenia",
    "state": "",
    "cases": "72674"
  },
  {
    "country": "Solomon Islands",
    "state": "",
    "cases": "17"
  },
  {
    "country": "Somalia",
    "state": "",
    "cases": "4451"
  },
  {
    "country": "South Africa",
    "state": "",
    "cases": "781941"
  },
  {
    "country": "South Sudan",
    "state": "",
    "cases": "3104"
  },
  {
    "country": "Spain",
    "state": "",
    "cases": "1628208"
  },
  {
    "country": "Sri Lanka",
    "state": "",
    "cases": "22501"
  },
  {
    "country": "Sudan",
    "state": "",
    "cases": "16864"
  },
  {
    "country": "Suriname",
    "state": "",
    "cases": "5311"
  },
  {
    "country": "Sweden",
    "state": "",
    "cases": "243129"
  },
  {
    "country": "Switzerland",
    "state": "",
    "cases": "318290"
  },
  {
    "country": "Syria",
    "state": "",
    "cases": "7635"
  },
  {
    "country": "Taiwan*",
    "state": "",
    "cases": "639"
  },
  {
    "country": "Tajikistan",
    "state": "",
    "cases": "12082"
  },
  {
    "country": "Tanzania",
    "state": "",
    "cases": "509"
  },
  {
    "country": "Thailand",
    "state": "",
    "cases": "3966"
  },
  {
    "country": "Timor-Leste",
    "state": "",
    "cases": "30"
  },
  {
    "country": "Togo",
    "state": "",
    "cases": "2926"
  },
  {
    "country": "Trinidad and Tobago",
    "state": "",
    "cases": "6586"
  },
  {
    "country": "Tunisia",
    "state": "",
    "cases": "93770"
  },
  {
    "country": "Turkey",
    "state": "",
    "cases": "548244"
  },
  {
    "country": "US",
    "state": "",
    "cases": "13088821"
  },
  {
    "country": "Uganda",
    "state": "",
    "cases": "19588"
  },
  {
    "country": "Ukraine",
    "state": "",
    "cases": "712249"
  },
  {
    "country": "United Arab Emirates",
    "state": "",
    "cases": "165250"
  },
  {
    "country": "United Kingdom",
    "state": "Anguilla",
    "cases": "4"
  },
  {
    "country": "United Kingdom",
    "state": "Bermuda",
    "cases": "242"
  },
  {
    "country": "United Kingdom",
    "state": "British Virgin Islands",
    "cases": "71"
  },
  {
    "country": "United Kingdom",
    "state": "Cayman Islands",
    "cases": "269"
  },
  {
    "country": "United Kingdom",
    "state": "Channel Islands",
    "cases": "1218"
  },
  {
    "country": "United Kingdom",
    "state": "Falkland Islands (Malvinas)",
    "cases": "16"
  },
  {
    "country": "United Kingdom",
    "state": "Gibraltar",
    "cases": "999"
  },
  {
    "country": "United Kingdom",
    "state": "Isle of Man",
    "cases": "369"
  },
  {
    "country": "United Kingdom",
    "state": "Montserrat",
    "cases": "13"
  },
  {
    "country": "United Kingdom",
    "state": "Turks and Caicos Islands",
    "cases": "748"
  },
  {
    "country": "United Kingdom",
    "state": "",
    "cases": "1589301"
  },
  {
    "country": "Uruguay",
    "state": "",
    "cases": "5303"
  },
  {
    "country": "Uzbekistan",
    "state": "",
    "cases": "72513"
  },
  {
    "country": "Vanuatu",
    "state": "",
    "cases": "1"
  },
  {
    "country": "Venezuela",
    "state": "",
    "cases": "101524"
  },
  {
    "country": "Vietnam",
    "state": "",
    "cases": "1339"
  },
  {
    "country": "West Bank and Gaza",
    "state": "",
    "cases": "80429"
  },
  {
    "country": "Western Sahara",
    "state": "",
    "cases": "10"
  },
  {
    "country": "Yemen",
    "state": "",
    "cases": "2148"
  },
  {
    "country": "Zambia",
    "state": "",
    "cases": "17569"
  },
  {
    "country": "Zimbabwe",
    "state": "",
    "cases": "9714"
  }
]
```
A Country record maybe repeated if the response contains data from more than one state of that particular country. For eg:

```
{
    "country": "Canada",
    "state": "Alberta",
    "cases": "53105"
  },
  {
    "country": "Canada",
    "state": "British Columbia",
    "cases": "30884"
  },
  {
    "country": "Canada",
    "state": "Diamond Princess",
    "cases": "0"
  }
```

### Data Source

The data is collected from the following source:

https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv
