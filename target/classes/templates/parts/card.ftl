<#macro card text smallText imgSrc>
    <div class="card border-dark" style="margin-bottom: 2rem">
        <img src="${imgSrc}" style="width: 20rem; height: 20rem">
        <div style="background-color: #e2e3e5"></div>
        <label class="card-text">${text}</label>
        <label class="card-text"><small class="text-muted">${smallText}</small></label>
    </div>
</#macro>