<html>
<head>
  <title>City Search Form</title>
  <style>
    body {
      font-family: 'Segoe UI', Arial, sans-serif;
      background: linear-gradient(135deg, #74ebd5 0%, #9face6 100%);
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }
    .form-container {
      background: #fff;
      padding: 30px 40px;
      border-radius: 12px;
      box-shadow: 0 8px 20px rgba(0,0,0,0.15);
      width: 350px;
      animation: fadeIn 0.8s ease-in-out;
    }
    h2 {
      text-align: center;
      margin-bottom: 25px;
      color: #0078d7;
      font-size: 24px;
    }
    label {
      display: block;
      margin: 12px 0 6px;
      font-weight: 600;
      color: #333;
    }
    select {
      width: 100%;
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 6px;
      font-size: 15px;
      transition: border-color 0.3s;
    }
    select:focus {
      border-color: #0078d7;
      outline: none;
      box-shadow: 0 0 5px rgba(0,120,215,0.4);
    }
    button {
      width: 100%;
      padding: 12px;
      background: #0078d7;
      color: white;
      border: none;
      border-radius: 6px;
      font-size: 16px;
      cursor: pointer;
      transition: background 0.3s, transform 0.2s;
    }
    button:hover {
      background: #005fa3;
      transform: translateY(-2px);
    }
    @keyframes fadeIn {
      from { opacity: 0; transform: translateY(20px); }
      to { opacity: 1; transform: translateY(0); }
    }
    @media (max-width: 480px) {
      .form-container {
        width: 90%;
        padding: 20px;
      }
    }
  </style>
</head>
<body>
  <div class="form-container">
    <h2>Flight Search</h2>
    <form action="/flightsearchresults" method="post">
      <label for="source">Source:</label>
      <select id="source" name="source">
        <option value="Delhi">Delhi</option>
        <option value="Mumbai">Mumbai</option>
        <option value="Bangalore">Bangalore</option>
        <option value="Chennai">Chennai</option>
        <option value="Kolkata">Kolkata</option>
      </select>

      <label for="destination">Destination:</label>
      <select id="destination" name="destination">
        <option value="Hyderabad">Hyderabad</option>
        <option value="Pune">Pune</option>
        <option value="Jaipur">Jaipur</option>
        <option value="Ahmedabad">Ahmedabad</option>
        <option value="Lucknow">Lucknow</option>
      </select>

      <button type="submit">Search Flights</button>
    </form>
  </div>
</body>
</html>