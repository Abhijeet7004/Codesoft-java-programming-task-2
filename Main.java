
		   <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EcoRide - Electric Cab Service</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        /* Background */
        body {
            background: url('C:\\Users\\Abhijeet Kumar Jha\\OneDrive\\Desktop\\java dsa\\background.webp.webp') no-repeat center top;
            background-size: cover;
            background-attachment: fixed;
            background-position: center 5px;
            color: black;
        }

        .navbar {
            background: rgba(0, 168, 89, 0.9);
            color: white;
            padding: 15px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .navbar h1 {
            font-size: 22px;
        }

        .container {
            padding: 20px;
            text-align: center;
        }

        /* Ride Section */
        .ride-section {
            background: transparent;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            margin: auto;
            color: black;
        }

        .ride-section input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .book-btn {
            background: #00a859;
            color: white;
            padding: 12px;
            border: none;
            width: 100%;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
        }

        .book-btn:hover {
            background: #008c4e;
        }

        /* Features Section */
        .features {
            display: flex;
            flex-direction: column;
            align-items: center;
            margin-top: 20px;
            gap: 40px;
        }

        .feature {
            background: rgb(233, 236, 232);
            padding: 20px;
            border-radius: 10px;
            max-width: 900px;
            width: 90%;
            display: flex;
            align-items: center;
            justify-content: space-between;
            text-align: left;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
        }

        .feature-content {
            max-width: 50%;
        }

        .feature h2 {
            font-size: 22px;
            color: black;
        }

        .feature p {
            color: gray;
            margin: 10px 0;
        }

        .feature button {
            background: black;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .feature button:hover {
            background: #333;
        }

        .feature-images {
            display: grid;
            grid-template-columns: repeat(2, 1fr);
            gap: 10px;
        }

        .feature-images img {
            width: 100px;
            height: 100px;
            border-radius: 10px;
            object-fit: cover;
        }
        .faq-section {
            background: linear-gradient(to bottom, white);
            color: white;
            padding: 20px;
            text-align: center;
            margin-top: 40px;
            border-radius: 10px;
            max-width: 600px;
            margin-left: center;
            margin-right: center;
        }

        .faq-section h2 {
            font-size: 24px;
            font-weight: bold;
        }

        .faq-section p {
            font-size: 14px;
            margin-bottom: 20px;
        }

        .faq-item {
            background: transparent;
            color: black;
            padding: 10px;
            margin: 5px 0;
            border-radius: 5px;
            text-align: center;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: background 0.3s ease-in-out;
        }

        .faq-item:hover {
            background: #f8f8f8;
        } 
        .faq-item::after {
            content: "+";
            font-size: 18px;
            color: #1a8f3b;
        }

        .faq-item.active::after {
            content: "-";
        }
        .faq-answer {
            display: none;
            padding: 10px;
            color: black;
            font-weight: normal;
            text-align: center;
        }
        /* Footer */
        .footer {
            text-align: center;
            padding: 15px;
            margin-top: 40px;
            background: rgba(0, 168, 89, 0.9);
            color: white;
            position: relative;
            bottom: 0;
            width: 100%;
        }

        @media (max-width: 768px) {
            .feature {
                flex-direction: column;
                text-align: center;
            }
            .feature-content {
                max-width: 100%;
            }
            .feature-images {
                margin-top: 10px;
            }
        }
    </style>
</head>
<body>

    <!-- Navbar -->
    <div class="navbar">
        <h1>EcoRide</h1>
    </div>

    <!-- Ride Booking -->
    <div class="container">
        <h2>Go for Green,Go for EcoRide!</h2>

        <div class="ride-section">
            <input type="text" placeholder="Enter Pickup Location">
            <input type="text" placeholder="Enter Drop Location">
            <button class="book-btn" onclick="redirectToYouTube()">Book Ride</button>

<script>
    function redirectToYouTube() {
        window.open("https://www.youtube.com/YOUR_CHANNEL", "_blank");
    }
</script>

        </div>
    </div>

    <!-- Features Section -->
    <div class="features">
        <!-- Feature 1 -->
        <div class="feature">
            <div class="feature-content">
                <h2>Get Quick Rides, Low Fares</h2>
                <p>In EcoRide, we ensure our customers get rides quickly at the most affordable prices.</p>
                <button class="book_aride-" onclick="redirectToYouTube()">Book Ride</button>

<script>
    function redirectToYouTube() {
        window.open("https://www.youtube.com/YOUR_CHANNEL", "_blank");
    }
</script>

            </div>
            <div class="feature-images">
                <img src="images/auto1.jpg" alt="Auto Ride">
                <img src="images/delivery.jpg" alt="Delivery">
                <img src="images/bike.jpg" alt="Bike Ride">
                <img src="images/car.jpg" alt="Car Ride">
            </div>
        </div>

        <!-- Feature 2 -->
        <div class="feature">
            <div class="feature-content">
                <h2>Flexible Hours & High Earnings</h2>
                <p>Join as an EcoRide captain and earn on your own terms. Drive whenever you want.</p>
                <button class="join as-" onclick="redirectToYouTube()">Book Ride</button>

<script>
    function redirectToYouTube() {
        window.open("https://www.youtube.com/YOUR_CHANNEL", "_blank");
    }
</script>

            </div>
            <div class="feature-images">
                <img src="images/scooter.jpg" alt="Scooter Driver">
                <img src="images/auto2.jpg" alt="Auto Driver">
                <img src="images/deliverymen.jpg" alt="Delivery">
                <img src="images/earning.jpg" alt="Earnings">
            </div>
        </div>

        <!-- Feature 3 -->
        <div class="feature">
            <div class="feature-content">
                <h2>Safety for All</h2>
                <p>At EcoRide, your safety is our priority. We’re dedicated to making every ride safe and comfortable.</p>
            </div>
            <img src="images/safety.jpg" alt="Safety" style="width: 200px; border-radius: 10px;">
        </div>
    </div>
    <div class="faq-container">
        <h1>Frequently Asked Questions</h1>
        <p>Common questions about women's healthcare and ZenHer services.</p>

        <div class="faq-item" onclick="toggleAnswer(this)">
            What services does ZenHer offer?
        </div>
        <div class="faq-answer">
            ZenHer offers AI-powered health tracking, menstrual cycle monitoring, virtual doctor consultations, and more.
        </div>

        <div class="faq-item" onclick="toggleAnswer(this)">
            How does AI help in women's healthcare?
        </div>
        <div class="faq-answer">
            AI helps by analyzing health data, predicting cycles, offering medical advice, and personalizing healthcare recommendations.
        </div>

        <div class="faq-item" onclick="toggleAnswer(this)">
            Is my health data secure?
        </div>
        <div class="faq-answer">
            Yes, ZenHer follows strict security and encryption measures to ensure your health data remains private.
        </div>

        <div class="faq-item" onclick="toggleAnswer(this)">
            Can I track my menstrual cycle with ZenHer?
        </div>
        <div class="faq-answer">
            Yes, ZenHer offers an advanced period tracking system with AI-driven insights.
        </div>

        <div class="faq-item" onclick="toggleAnswer(this)">
            How do I contact support?
        </div>
        <div class="faq-answer">
            You can contact ZenHer support through email, phone, or live chat on the official website.
        </div>
    </div>

    <script>
        function toggleAnswer(element) {
            let answer = element.nextElementSibling;

            if (answer.style.display === "block") {
                answer.style.display = "none";
                element.classList.remove("active");
            } else {
                answer.style.display = "block";
                element.classList.add("active");
            }
        }
    </script>
    <!-- Footer -->
    <div class="footer">
        <p>EcoRide - Affordable & Green Rides</p>
    </div>

</body>
</html>

		
