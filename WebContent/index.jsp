<!DOCTYPE html>
<html>
	<head>
		<title>Home</title>
		<link rel="icon" href="/Movies/assets/img/2koredsavatar.png"/>
		<%@ include file="includes/styles.jsp" %>
	</head>
	<body>
		<div id="wrapper">
			<div id="header">
				<img src="/Movies/assets/img/2koredsavatar.png"/>
				<h1>Home</h1>
				<%@ include file="includes/navigation.jsp" %>
			</div>
			<div id="container">
				<h3>Welcome to the Home Page of Matthew's Movies!</h3>
				<hr>
				<div id="starwars">
					<img src="/Movies/assets/img/starwars.png" alt="star wars logo" width="230px" height="117px"/>
					<p>
						This site holds information for the <i>Star Wars</i> movies. For those of you who wish to learn
						more about the movie series, you can visit the <a href="http://www.starwars.com">starwars.com</a> web-site.
					</p>
					<p>
						Extensive research may lead you to the <a href="http://www.starwars.com/databank">databank</a> that has information
						on literally everything there is about <i>Star Wars</i>. Enjoy!
					</p>
				</div>
				<hr>
				<div id="lordOfTheRings">
					<img src="/Movies/assets/img/lotrLogo.jpg" alt="Lord of the Rings logo" width="200px" height="200px"/>
					<p>
						This site holds information for the <i>Lord of the Rings</i> and <i>The Hobbit</i> movies. For those of you who wish to learn
						more about the movie series, you can visit the <a href="http://www.lordoftherings.net/">lordoftherings.net</a> web-site.
					</p>
					<p>
						Although <i>Lord of the Rings</i> and <i>The Hobbit</i> are technically the same story line, LOTR(<i>Lord of the Rings</i>) movies were released first.
						As a result, <i>The Hobbit</i> is considered the "prequel" to LOTR. For more information on <i>The Hobbit</i> you can visit 
						<a href="http://www.thehobbit.com/">The Hobbit</a> web-site.
					</p>
				</div>
				<hr>
				<div id="harryPotter">
					<img src="/Movies/assets/img/harryPotterLogo.jpg" alt="Harry Potter logo" width="256px" height="185.5px"/>
					<p>
						This site holds information for the <i>Harry Potter</i> movies. For those of you who wish to learn
						more about the movie series, you can visit the <a href="https://www.pottermore.com/">pottermore</a> web-site.
					</p>
					<p>
						There is also information on this page regarding the <i>Harry Potter</i> movie series prequel, <i>Fantastic Beasts and Where to Find Them</i>!
					</p>
				</div>
				<%@ include file="includes/footer.jsp" %>
			</div>
		</div>
		<!-- <%@ include file="includes/scripts.jsp" %> -->
	</body>
</html>