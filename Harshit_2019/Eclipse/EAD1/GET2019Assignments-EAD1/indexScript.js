function validate(){
	         var pass1 = document.getElementById('Password').value;
	         var pass2 = document.getElementById('Confirm-Password').value;
	         if(pass1 != pass2){
	             alert("password does not match");
	             return false;
	         } 
	         else{
	             alert("proceed further");
	         var x = document.getElementById('Employee');
	         var y = document.getElementById('AddVehicle');
	
	       
	             y.style.display="block";
	             x.style.display="none";
	
	
	
	             return false;
	         }
	     }
		function showPassPrice(form){
	
		    alert("FORM SUBMITTED");
		         var y = document.getElementById('AddVehicle');
		         var z = document.getElementById('ShowPass'); 
		
		     y.style.display = "none";
		     z.style.display = "block";
		     Type = form.Type.value;
		    if(Type == "Cycle"){
		       document.getElementById('Daily').innerHTML = '5';
		       document.getElementById('Monthly').innerHTML = '100';
		       document.getElementById('Yearly').innerHTML = '500';
		    }
		    else if(Type == "MotorCycle"){
		        document.getElementById('Daily').innerHTML = '10';
		       document.getElementById('Monthly').innerHTML = '200';
		       document.getElementById('Yearly').innerHTML = '1000';
		    }
		    else if(Type == "FourWheeler"){
		        document.getElementById('Daily').innerHTML = '210';
		       document.getElementById('Monthly').innerHTML = '500';
		       document.getElementById('Yearly').innerHTML = '3500';
		    }
		     return false;
		
		}
		function displayPass(form){
		    alert("i am going to display");
		 var z = document.getElementById('ShowPass');
		 var a = document.getElementById('GeneratePass');
		
		
		 document.getElementById('Name').innerHTML = document.getElementById('Ename').value;
		 document.getElementById('Vehicle').innerHTML = document.getElementById('Vno').value;
		 document.getElementById('Price').innerHTML = form.Passes.value;
		 z.style.display = "none";
		 a.style.display = "block";
		
		
		  return false;
		
		
		}
	     function parkingSystem(){
	         var x = document.getElementById('Employee');
	         var y = document.getElementById('AddVehicle');
	          var z = document.getElementById('ShowPass'); 
	          var a = document.getElementById('GeneratePass');
	
	          x.style.display = "block";
	          y.style.display = "none";
	          z.style.display = "none";
	          a.style.display = "none";
	    
	     }function validate(){
	         var pass1 = document.getElementById('Password').value;
	         var pass2 = document.getElementById('Confirm-Password').value;
	         if(pass1 != pass2){
	             alert("password does not match");
	             return false;
	         } 
	         else{
	             alert("proceed further");
	         var x = document.getElementById('Employee');
	         var y = document.getElementById('AddVehicle');
	
	       
	             y.style.display="block";
	             x.style.display="none";
	
	
	
	             return false;
	         }
	     }
		function showPassPrice(form){
	
		    alert("FORM SUBMITTED");
		         var y = document.getElementById('AddVehicle');
		         var z = document.getElementById('ShowPass'); 
		
		     y.style.display = "none";
		     z.style.display = "block";
		     Type = form.Type.value;
		    if(Type == "Cycle"){
		       document.getElementById('Daily').innerHTML = '5';
		       document.getElementById('Monthly').innerHTML = '100';
		       document.getElementById('Yearly').innerHTML = '500';
		    }
		    else if(Type == "MotorCycle"){
		        document.getElementById('Daily').innerHTML = '10';
		       document.getElementById('Monthly').innerHTML = '200';
		       document.getElementById('Yearly').innerHTML = '1000';
		    }
		    else if(Type == "FourWheeler"){
		        document.getElementById('Daily').innerHTML = '210';
		       document.getElementById('Monthly').innerHTML = '500';
		       document.getElementById('Yearly').innerHTML = '3500';
		    }
		     return false;
		
		}
		function displayPass(form){
		    alert("i am going to display");
		 var z = document.getElementById('ShowPass');
		 var a = document.getElementById('GeneratePass');
		
		
		 document.getElementById('Name').innerHTML = document.getElementById('Ename').value;
		 document.getElementById('Vehicle').innerHTML = document.getElementById('Vno').value;
		 document.getElementById('Price').innerHTML = form.Passes.value;
		 z.style.display = "none";
		 a.style.display = "block";
		
		
		  return false;
		
		
		}
	     function parkingSystem(){
	         var x = document.getElementById('Employee');
	         var y = document.getElementById('AddVehicle');
	          var z = document.getElementById('ShowPass'); 
	          var a = document.getElementById('GeneratePass');
	
	          x.style.display = "block";
	          y.style.display = "none";
	          z.style.display = "none";
	          a.style.display = "none";
	    
	     }