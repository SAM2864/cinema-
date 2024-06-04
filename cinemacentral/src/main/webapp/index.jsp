
<%@page import="utils.StringUtils"%>
<%
String contextPath = request.getContextPath();
String errMsg = (String) request.getAttribute(StringUtils.MESSAGE_ERROR);
String successMsg = (String) request.getAttribute(StringUtils.MESSAGE_SUCCESS);
String username = (String) request.getAttribute(StringUtils.USERNAME);

%>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="css" href="./css/index.css">
    <script src="home page.js"></script>

    <title>CinemaCentral</title>
</head>
<body>
    
    
<header>
    <nav>
    <p class="logo">
     cinema central <span>CinemaCentral</span>
    </p>
      
      <i class="fa fa-bars" id="menu"></i>
      <ul id="menu-box">
        <div class="marker"></div>
        <li><a href="#">main</a></li>
     <a href="<%=contextPath+ StringUtils.PAGE_URL_LOGIN%>">Sign Up</a>
       
        <li><a href="./book now.html">register</a></li>
        <li><a href="#"><span>mr.john doe <img src="suyash .png"> <i class="suyash "></i></span></a></li>
        <li><a href="#"><b> logout</b></a></li>
      </ul>
      
      
      
      
  </nav>
  <div class="schedlues">
  
  </div>
   <div class="popular-movie-slider">
      
      <img src="ashiqui 2.jpg" class="poster">
      
      <div class="popular-movie-slider-content">
        <p class="release">2017</p>
        <h2 class="movie-name">ashiqui 2</h2>
        <ul class="category">
          <p> romance </p>
         
          <li>action</li>
        </ul>
        <p class="desc">Lorem ipsum dolor sit amet
             consectetur adipisicing elit. Blanditiis distinctio l
             aborum, doloribus asperiores amet beatae ab cumque cum numquam nostrum 
            incidunt vel recusandae vero saepe eveniet? Debitis commodi sapiente porro!    
        <div class="movie-info">
          <i class="fa fa-clock-o"> <span>164 min.</span></i> 
          <i class="fa fa-volume-up"> <span>Subtitles</span></i>
          <i class="fa fa-circle"> <span>Imdb: <b>9.1/10</b></span></i>
        </div>
        
        <div class="movie-btns">
          <button><i class="fa fa-play"></i> &nbsp; Watch trailer</button>
          <button class="read-more"><i class="fa fa-circle"></i> <i class="fa fa-circle"></i> <i class="fa fa-circle"></i>&nbsp; Read more</button>
        </div>
        
      </div>
      
    </div>
</header>

<section>
     <div class="filter-search-box">
    
    <div class="filters-box">
      
      <div class="all-filters filters">
        All formats <i class="fa fa-angle-down"></i>
      </div> 
      
      <div class="date-filters filters">
       By Date <i class="fa fa-angle-down"></i>
      </div> 
      
      <div class="category-filters filters">
        By category <i class="fa fa-angle-down"></i>
      </div> 
      
      <div class="category-filters filters">
        Coming soon
      </div> 
      
    </div>
    
    <div class="search-filters">
        <input type="text" placeholder="Search by name...">
        <i class="fa fa-search"></i>
      </div> 
    
    <div class="search-bar">
      <div class="bar"></div>
    </div>
    
  </div>
  <div class="movie-card-section">
    
    <div class="card">
      <img src="]d.png">
      
      <div class="card-content">
        <p class="movie-name">
         dil bichara 
        </p>
        <div class="movie-info">
          <p class="time">11:30 <span>romance <span class="d3">action </span>
             16:05<span class="d3">3D</span></span> 
             18:40 21:00 23:15</p>
        </div>
      </div>
    </div>
    <div class="card">
      <img src="pk.png">
      
      <div class="card-content">
        <p class="movie-name">
          pk 
        </p>
        
        <div class="movie-info">
          <p class="time">11:30 <span>14:45 16:05</span> 18:40 21:00</p>
        </div>
      </div>
    </div>
    <div class="card">
      <img src="M.S._Dhoni_-_The_Untold_Story_poster.jpg">
      
      <div class="card-content">
        <p class="movie-name">
        ms _Dhoni_-_The_Untold_Story
        </p>
        
        <div class="movie-info">
          <p class="time">bibliography 
            <span class="d3">3D</span> 
            <span>14:45 16:05<span class="d3">3
            2nd</span></span> 18:40 21:00 23:15</p>
        </div>
      </div>
    </div>
    <div class="card">
      <img src="512px-Kai_Poche_film_poster.webp">
      
      <div class="card-content">
        <p class="movie-name">
      Kai_Poche
        </p>
        
        <div class="movie-info">
          <p class="time"><span>
            drama<span class="d3">
                sport</span></span> 18:40 21:00 23:15</p>
        </div>
      </div>
    </div>
    
    <div class="card">
      <img src="kedarnath .png">
      
      <div class="card-content">
        <p class="movie-name">
         kedarnath
        </p>
        
        <div class="movie-info">
          <p class="time">
            romance<span>
               drama<span class="d3">
                3D</span> 16:05<span class="d3">3D</span>
            </span> 18:40 21:00</p>
        </div>
      </div>
    </div>
    <div class="card">
      <img src="Raabta_poster.jpg">
      
      <div class="card-content">
        <p class="movie-name">
        Raabta

        </p>
        
        <div class="movie-info">
          <p class="time">
           action<span>14:45 16:05</span> 18:40 21:00</p>
        </div>
      </div>
    </div>
    <div class="card">
      <img src="Chhichhore_Poster.jpg">
      
      <div class="card-content">
        <p class="movie-name">
      Chhichhore
        </p>
        
        <div class="movie-info">
          <p class="time">comedy <span class="d3">romance</span> 
            <span>14:45 16:05<span class="d3">3D</span></span> 18:40 21:00 23:15</p>
        </div>
      </div>
    </div>
    <div class="card">
      <img src="Drive_Netflix_Film.jpg">
      
      <div class="card-content">
        <p class="movie-name">
          drive
        </p>
        
        <div class="movie-info">
          <p class="time"><span>11:30 16:05<span class="d3">3D</span></span> 18:40 21:00 23:15</p>
        </div>
      </div>
    </div>
    
  </div>
  <div class="show">
    <div class="show-bar">
      <div class="bar"></div>
    </div>
     <button>Show more</button>
  </div>
 </section>
 <footer>
  
  <div class="logo-box">
    <p class="logo">
      multi<span>flex</span>
    </p>
    <p><i class="fa fa-copyright"></i>CinemaCentral</p>
  </div>
  
  <ul>
    <li>main</li>
    <li>schedlues</li>
    <li>tickets</li>
    <li>news</li>
    <li>contact</li>
  </ul>


<div class="socail-box">
  <i class="fa fa-facebook-f"></i>
  <i class="fa fa-twitter"></i>
  <i class="fa fa-instagram"></i>
</div>
  
</footer>


</body>
</html>