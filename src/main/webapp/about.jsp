<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
    <title>店舗紹介</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<h1>店舗紹介</h1>

<p>仙台駅から徒歩7分。本場仙台牛タンの名店です。</p>

<h2>営業時間</h2>
<p>11:00～20:00（定休日：毎週水曜）</p>

<h2>アクセス</h2>
<p>宮城県仙台市青葉区〇〇 1-2-3<br>仙台駅西口より徒歩7分</p>
<!-- 地図を見る ボタン -->
<button id="mapBtn">地図を見る</button>

<!-- ポップアップ（モーダル） -->
<div id="mapModal" class="modal">
  <div class="modal-content">
    <span id="closeBtn" class="close">&times;</span>
    <!-- 生成した地図画像をここに設置 -->
    <img src="${pageContext.request.contextPath}/images/6cd99e32-a46c-423d-8d4c-eabb30c4c446.png"
     alt="店舗地図"
     style="width:100%; height:auto;">

  </div>
</div>


<h2>駐車場のご案内</h2>
<p>当店をご利用のお客様は、提携駐車場の 「○○駐車場」 をご利用いただけます。
お車でお越しの際は、ぜひご活用ください。</p>
<p>「○○駐車場」の 駐車券を会計時にご提示いただくと、駐車料金が無料 になります。</p>

<h2>お支払い方法について</h2>
<p>当店では、さまざまなお支払い方法に対応しております。
お客様のご都合に合わせて、以下の決済手段をご利用いただけます。

<br>■ クレジットカード

<br>下記ブランドのクレジットカードをご利用いただけます。
VISA / MasterCard / JCB / AMERICAN EXPRESS / Diners Club
<br>（一括払いのみ）

<br>■ 交通系ICカード

<br>Suica・PASMO をはじめとした全国の交通系ICカードがご利用いただけます。
（PiTaPaは除く）

<br>■ その他

<br>現金支払いも従来どおりご利用いただけます。</p>

<a class="back" href="index.html">トップページへ戻る</a>

<script>
        // ボタンとモーダル取得
        const mapBtn = document.getElementById("mapBtn");
        const mapModal = document.getElementById("mapModal");
        const closeBtn = document.getElementById("closeBtn");

        // 開く
        mapBtn.onclick = () => {
            mapModal.style.display = "block";
        };

        // 閉じる
        closeBtn.onclick = () => {
            mapModal.style.display = "none";
        };

        // モーダル外クリックで閉じる
        window.onclick = (event) => {
            if (event.target === mapModal) {
                mapModal.style.display = "none";
            }
        };
    </script>

</body>
</html>
