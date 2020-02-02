<#import "parts/common.ftl" as page>
<#import "parts/navbar.ftl" as navbar>
<#import "parts/alertTab.ftl" as alert>
<#import "parts/card.ftl" as card>
<@page.page "Новости">
    <@navbar.navbar></@navbar.navbar>
    <div style="width: 75%; position: relative; left: 12.5%">
        <div class="card">
            <#list posts as post>
                <@card.card  "${post.text}" "${post.srcToImage}"></@card.card>
            </#list>
        </div>
    </div>



</@page.page>