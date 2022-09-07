document.getElementById("data").value = new Date().toISOString().slice(0, 10);

function checkAnaf() {
			event.preventDefault();			
			var cui = document.getElementById("formAnaf").elements["cui"].value;
			var checkDate = document.getElementById("formAnaf").elements["data"].value;
			data = {"cui": cui, "data": checkDate};
			
			fetch('/api/check', {
				  method: 'POST', // or 'PUT'
				  headers: {
				    'Content-Type': 'application/json',
				  },
				  body: JSON.stringify(data),
				})
				.then(response => response.json())
				.then(data => {
				  document.getElementById("btnExportExcel").removeAttribute("hidden");
				  document.getElementById("htmlInfo").innerHTML = data.htmlInfo;
				  document.getElementById("htmlInfo").scrollIntoView();
				})
				.catch((error) => {
				  console.error('Error:', error);
				});
			
		}
		
			async function checkFile() {
				event.preventDefault();			
				htmlInfo.innerHTML = null;
				fileInfo.hidden=false;
				let formData = new FormData();
				formData.append("file", fileUpload.files[0]);
			   
				await fetch('/api/filecheck', {
				      method: "POST", 
				      body: formData
				    }).then(function(response){
				    	if (!response.ok){
				    		throw new Error(`HTTP error! status: ${response.status}`);
				    	}
				    	return response.blob();
				    }).then(function(blob){
				    	var a = document.createElement("a");
				    	a.download = "rezultat.xlsx"; 
				        a.href = URL.createObjectURL(blob);						      
				        a.click();
				        a.remove();
				    });    	
				    fileInfo.hidden= true;			   
		}
			
			function setProgressBarValue(progressBar, value)
			{
				progressBar.style="width: "+value+"%";
				progressBar.innerHTML = value+"%";
			}
			
	function exportToExcel() {
		$("#tblData").table2excel({
			filename: "rezultat.xlsx",
			filext: ".xlsx",
			preserveColors: false
		});
	}