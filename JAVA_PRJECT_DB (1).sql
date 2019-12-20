--
-- File generated with SQLiteStudio v3.2.1 on Sat Nov 23 19:57:57 2019
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Brands
DROP TABLE IF EXISTS Brands;

CREATE TABLE Brands (
    BrandId INT,
    Name    NVARCHAR (20),
    CONSTRAINT PK_BrandId PRIMARY KEY (
        BrandId
    )
);

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       100,
                       'Reebok'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       101,
                       'New Balance'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       102,
                       'No Bull'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       103,
                       'Adidas'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       104,
                       'Cloud'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       105,
                       'Under Armour'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       106,
                       'Asics'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       107,
                       'Bio'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       108,
                       'Nike'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       109,
                       'Columbia'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       110,
                       'Dasmejan'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       111,
                       'Ice'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       112,
                       'Sculp Mode'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       113,
                       '3G'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       114,
                       'Exerpeutic'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       115,
                       'Survival Cross'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       116,
                       'Bowflex'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       117,
                       'TRX'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       118,
                       'Universal'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       119,
                       'Everlast'
                   );

INSERT INTO Brands (
                       BrandId,
                       Name
                   )
                   VALUES (
                       120,
                       'Triggerpoint'
                   );


-- Table: CartLine
DROP TABLE IF EXISTS CartLine;

CREATE TABLE CartLine (
    CartLineId [INT IDENTITY] (1, 1) NOT NULL,
    OrderId    INT                   REFERENCES Orders,
    ProductId  INT                   NOT NULL
                                     REFERENCES Products (ProductId),
    Quantity   INT                   NOT NULL,
    CONSTRAINT PK_CartLine PRIMARY KEY (
        CartLineId
    ),
    CONSTRAINT FK_CartLine_Orders_OrderId FOREIGN KEY (
        OrderId
    )
    REFERENCES Orders
);


-- Table: CartRegister
DROP TABLE IF EXISTS CartRegister;

CREATE TABLE CartRegister (
    ProductId INT
);


-- Table: Category
DROP TABLE IF EXISTS Category;

CREATE TABLE Category (
    CategoryId INT           NOT NULL,
    Name       NVARCHAR (20),
    CONSTRAINT PK_Category PRIMARY KEY (
        CategoryId
    )
);

INSERT INTO Category (
                         CategoryId,
                         Name
                     )
                     VALUES (
                         1,
                         'Shoes'
                     );

INSERT INTO Category (
                         CategoryId,
                         Name
                     )
                     VALUES (
                         2,
                         'WorkoutEquipment'
                     );

INSERT INTO Category (
                         CategoryId,
                         Name
                     )
                     VALUES (
                         3,
                         'Apparels'
                     );


-- Table: Orders
DROP TABLE IF EXISTS Orders;

CREATE TABLE Orders (
    OrderId   INT           NOT NULL,
    Address   NVARCHAR (20) NOT NULL,
    Name      NVARCHAR (29) NOT NULL,
    PaymentId INT           NOT NULL
                            REFERENCES Payment (PaymentId),
    userId    INT           NOT NULL
                            REFERENCES user (userId),
    Shipped   BIT           NOT NULL,
    CONSTRAINT PK_Orders PRIMARY KEY (
        OrderId
    ),
    CONSTRAINT FK_Orders_Payment_PaymentId FOREIGN KEY (
        PaymentId
    )
    REFERENCES Payment (userId) ON DELETE CASCADE,
    CONSTRAINT FK_User_UserId FOREIGN KEY (
        userId
    )
    REFERENCES user ON DELETE CASCADE
);


-- Table: Payment
DROP TABLE IF EXISTS Payment;

CREATE TABLE Payment (
    PaymentId        INT             NOT NULL,
    AuthCode         NVARCHAR (20),
    CardExpiry       NVARCHAR (20)   NOT NULL,
    CardNumber       NVARCHAR (20)   NOT NULL,
    CardSecurityCode INT             NOT NULL,
    Total            DECIMAL (18, 2) NOT NULL,
    CONSTRAINT PK_Payment PRIMARY KEY (
        PaymentId
    )
);


-- Table: Products
DROP TABLE IF EXISTS Products;

CREATE TABLE Products (
    ProductId   INT             NOT NULL
                                PRIMARY KEY,
    Description NVARCHAR (20),
    Name        NVARCHAR (20),
    BrandId     INT             REFERENCES Brands (BrandId) ON DELETE CASCADE
                                                            ON UPDATE CASCADE,
    CategoryId  INT             REFERENCES Category (CategoryId) ON DELETE CASCADE
                                                                 ON UPDATE CASCADE,
    Price       DECIMAL (18, 2) NOT NULL,
    image       NVARCHAR (20) 
);

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         121,
                         'Highest ranking shoe due to its overall outstanding scores when it comes to sports due to its compatibility with all sports ',
                         'Reebok YourFlex 8.0',
                         100,
                         1,
                         32.99,
                         'ReebokYourFlex.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         122,
                         'Breatheable and lightweight shoe that brings versaitility for wearers and is made to fit for all atheletes',
                         'New Balance MX40V1',
                         101,
                         1,
                         95.95,
                         'NewBalanceMX40V1.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         123,
                         'Super fabric guard plated shoes that enhances the durability of these shoes allowing athletes to work harder while also providing full comfort',
                         'No Bull Ivy',
                         102,
                         1,
                         129,
                         'NoBullIvy.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         124,
                         'Free Foam sole integrated into this shoe for maximum flexibility with an injected midsole providing support and comfort for wearer',
                         'Nike Free',
                         108,
                         1,
                         78.86,
                         'NikeFree.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         125,
                         'Verstile shoes with many modifications while also giving top comfort and support for wearers ',
                         'Nike Metcon 4',
                         108,
                         1,
                         118.7,
                         'NikeMetcon4.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         126,
                         'The Adidas Aleki X are excellent choice for athletes participating in various activities as they provide great comfort for all workouts with comfort and stability',
                         'Adidas Alekxi X',
                         103,
                         1,
                         110,
                         'AdidasAlekxiX.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         127,
                         'The Cloud X are versatile shoes that are both comfortable and flexible perfect for all.  These shoes are exactly what every athlete is looking for as they are functional in all areas',
                         'Cloud X',
                         104,
                         1,
                         50.85,
                         'CloudX.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         128,
                         'This shoes is great pick for all around performance with affordable price.  Users loves comfort and stability and this shoes packs exactly what users wants',
                         'Under Armour Ultimate Speed',
                         105,
                         1,
                         74.99,
                         'UnderArmourUltimateSpeed.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         129,
                         'The Asics Conviction are perfect multi-functional shoe that allows you to jump activity to activity without sacrifice of comfort, flexibility and stability during workouts.',
                         'Asics Conviction',
                         106,
                         1,
                         120,
                         'AsicsConviction.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         130,
                         'Comfortable and versatile shoes perfect for all your athletic endeavor and comes with a little twist, great styles.',
                         'Bio Speed',
                         107,
                         1,
                         44.99,
                         'BioSpeed.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         131,
                         'Adidas newest compression wear designed to wrap around muscle for secure feel with stretchy fabric to absorb sweat.  It is perfect for all workout and made to stay cool',
                         'Adidas Climachill',
                         103,
                         3,
                         23,
                         'AdidasClimachill.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         132,
                         'Perfect for yoga participants as it is made with fabric that gives extra grip enhancing balance.  In addition, the durability of the material is top class making it one of the to choices.',
                         '2XU IceX',
                         111,
                         3,
                         87.99,
                         '2XUIceX.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         133,
                         'Noted as the best gear to arm your body for obstacle courses.  This gear is made with HeatGear fabric which gives great squeeze on muscles enhancing performance while also providing excellent fabric to the touch',
                         'Under Armour Vanish',
                         105,
                         3,
                         29.99,
                         'UnderArmourVanish.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         134,
                         'The design of Sculp Mode incorporates whole calibur of tech fabric whose purpose is to keep user cool throughout their workout',
                         'Sculp Mode',
                         112,
                         3,
                         33.99,
                         'Sculp Mode.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         135,
                         'Long sleeve stretch top that offers minimal seaming offering more streamlined design and improved breathability.  This clothing also has mesh venting to further increase airflow for users',
                         'New Balance stretch top',
                         101,
                         3,
                         30,
                         'NewBalanceStretchSleeve.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         136,
                         'Scientifically made sleepwear designed to hlep improve sleep.  Many research were done to create a fiber used as main material in this clothing to ensure body receive maximum benefit and meets body''s need during sleep',
                         'Dagsmejan Temp-Control Sleepwear',
                         110,
                         3,
                         120,
                         'DagsmejanTempControl.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         137,
                         'With fleece material integrated into this wear, it provides unmatched comfort for the wearer no matter what type of activity they are involved in',
                         'Nike Fleece Hoodie',
                         108,
                         3,
                         80,
                         'NikeHoodie.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         138,
                         'Lightweight knit fabric providing lightweight and relaxing touch to the skin.  In addition, a inner traps natural heat keeping you warm from the chill throughout your workout',
                         'Under Armour Jogger',
                         105,
                         3,
                         43.99,
                         'UnderArmourJogger.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         139,
                         'Ultimate protection against the winter element with a drawcord waist and cuff tab for easy adjustment against natural elements.  Omni Shield technlogy also integrated to resist stains and moisture ',
                         'Columbia Gate Racer Softshell Jacket',
                         109,
                         3,
                         108.25,
                         'ColumbiaGateRacer.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         140,
                         'Designed to handle the toughtest workout with lasting warmth and durable comfort perfect for outdoor activities',
                         'Nike Therma Training Pants',
                         108,
                         3,
                         55,
                         'NikeTherma.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         141,
                         '62 Inch long platform with quality suspension system keeping the treadmill smooht and steady.  This treadmill comes with many features such as phone conneciton as well as cooling fan',
                         '3G Cardio Elite Runner Treadmill',
                         113,
                         2,
                         3399,
                         '3GTreadmill.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         142,
                         'This bike is built with eight levels of resistence provding greater challenges.  The fram is also made with very durable and sturdy materials which can be easily folded when not in use',
                         'Exerpeutic Folding Upright Bike',
                         114,
                         2,
                         149.38,
                         'ExerpeuticBike.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         143,
                         'This jump rope comes with an adjustable length and comfortable handle perfect for all sorts of training.  ',
                         'Survival and Cross Jump Rope',
                         115,
                         2,
                         10,
                         'SurvivalCrossRope.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         144,
                         'Blaze comes with over 60 possible exercises covering all body groups .  With the purchase of this machine, there is no need to go to the gym daily anymore.',
                         'Bowflex Blaze Home Gym',
                         116,
                         2,
                         799.99,
                         'BowFlexDumbbell.jpg'
                     );

INSERT INTO Products (
                         ProductId,
                         Description,
                         Name,
                         BrandId,
                         CategoryId,
                         Price,
                         image
                     )
                     VALUES (
                         145,
                         'This basic kit provides versaitlity and is the perfect tool kit for beginners who wishes to workout at home.  It also comes iwht many fitness guides that can help users ',
                         'TRX Training Suspension Trainer Basic Kit',
                         117,
                         2,
                         44.94,
                         'TRXSuspension.jpg'
                     );


-- Table: user
DROP TABLE IF EXISTS user;

CREATE TABLE user (
    userId   INT           NOT NULL,
    Username NVARCHAR (20) NOT NULL,
    Password NVARCHAR (29) NOT NULL,
    Email    NVARCHAR (20) NOT NULL,
    firsName NVARCHAR (20) NOT NULL,
    lastName NVARCHAR (20) NOT NULL,
    Address  NVARCHAR (20) NOT NULL,
    Phone    NVARCHAR (20) NOT NULL,
    CONSTRAINT PK_User PRIMARY KEY (
        userId
    )
);

INSERT INTO user (
                     userId,
                     Username,
                     Password,
                     Email,
                     firsName,
                     lastName,
                     Address,
                     Phone
                 )
                 VALUES (
                     1187351,
                     'Moorthy',
                     'password',
                     'mchera2@uic.edu',
                     'Moorthy',
                     'Cheran',
                     'Chicago',
                     '(773)-648-0823'
                 );

INSERT INTO user (
                     userId,
                     Username,
                     Password,
                     Email,
                     firsName,
                     lastName,
                     Address,
                     Phone
                 )
                 VALUES (
                     'svds',
                     'erge',
                     'rheer',
                     'erher',
                     'erhreh',
                     'erg',
                     'gerg',
                     'er'
                 );

INSERT INTO user (
                     userId,
                     Username,
                     Password,
                     Email,
                     firsName,
                     lastName,
                     Address,
                     Phone
                 )
                 VALUES (
                     'gsvds',
                     'egrge',
                     'rgheer',
                     'egrher',
                     'egrhreh',
                     'ergg',
                     'gerg',
                     'er'
                 );

INSERT INTO user (
                     userId,
                     Username,
                     Password,
                     Email,
                     firsName,
                     lastName,
                     Address,
                     Phone
                 )
                 VALUES (
                     'gsvggds',
                     'eggrge',
                     'rgheegr',
                     'eggrher',
                     'egrhreh',
                     'ergg',
                     'gerg',
                     'er'
                 );

INSERT INTO user (
                     userId,
                     Username,
                     Password,
                     Email,
                     firsName,
                     lastName,
                     Address,
                     Phone
                 )
                 VALUES (
                     'Martio',
                     'eggrge',
                     'rgheegr',
                     'eggrher',
                     'egrhreh',
                     'ergg',
                     'gerg',
                     'er'
                 );

INSERT INTO user (
                     userId,
                     Username,
                     Password,
                     Email,
                     firsName,
                     lastName,
                     Address,
                     Phone
                 )
                 VALUES (
                     'asd',
                     ' asfdg',
                     ' kjhfjd',
                     ';ou',
                     'gut',
                     'glgy',
                     'gku',
                     'gku'
                 );

INSERT INTO user (
                     userId,
                     Username,
                     Password,
                     Email,
                     firsName,
                     lastName,
                     Address,
                     Phone
                 )
                 VALUES (
                     'asdf',
                     ' asfdg',
                     ' kjhfjd',
                     ';ou',
                     'gut',
                     'glgy',
                     'gku',
                     'gku'
                 );

INSERT INTO user (
                     userId,
                     Username,
                     Password,
                     Email,
                     firsName,
                     lastName,
                     Address,
                     Phone
                 )
                 VALUES (
                     'asdfg',
                     ' asfdg',
                     ' kjhfjd',
                     ';ou',
                     'gut',
                     'glgy',
                     'gku',
                     'gku'
                 );

INSERT INTO user (
                     userId,
                     Username,
                     Password,
                     Email,
                     firsName,
                     lastName,
                     Address,
                     Phone
                 )
                 VALUES (
                     'mario',
                     ' oiwefm',
                     ' owief',
                     'oinfe',
                     'wein',
                     'siofn',
                     'oinf',
                     'oiewfi'
                 );


COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
