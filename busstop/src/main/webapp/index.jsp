<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Bus Stop Information</title>
    <style type="text/css">
    body {
  background-image:url("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxISEhUSEhISFhUXFRgXFxUXGBgXFxgVFRYWGBgWGBUYHSggGRolHRYVIjEiJSkrLi8uFx8zODMsNygtLisBCgoKDg0OGxAQGzIlICUtNy0tLy0tLS0tKy0tLSsvLS0tLS0tLS0tLS0tKy8tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIAKoBKQMBIgACEQEDEQH/xAAbAAABBQEBAAAAAAAAAAAAAAAAAQMEBQYCB//EAE8QAAEDAQUDCAMMBwYEBwAAAAEAAhEDBAUSITFBUZEGExQiUmFxgTKx0RUWIzNTcnOSk6Gy0gcXQlRiwfA0Q4KiwuHD0+LxJERjg5Sjs//EABoBAAIDAQEAAAAAAAAAAAAAAAACAQMFBAb/xAA5EQABAwEEBgkDBAAHAAAAAAABAAIRAwQSITETQVFhkfAUUnGBobHB0eEFIlMyM+LxIyQlYpKisv/aAAwDAQACEQMRAD8A9cQhC6VzoQlSIQhCEqEJEqE5SoknbG9QTCkCVwuVOZZwDOviu30gUmkCbRlV6RSbRQAEhR04IKUiEiEJVKhCEy+0NG2fBMPth2CFIaSlLgFNTZrtmJz7lXPqE6kruh6Q8U1xLfxwVihKkSKxCELirVDdUIXaE10pvfwR0pvfwU3TsUXgnUJrpTe/guqddpMBEFF4LtCVChSkSrumG7SfBSDVYco+5KXRqTAb1HbSccwFwQpvSm9/BHSW/wBBLedsU3RtUFCetD2kyPNNJwZCQpELpcqUIQhCEISqttd+2emYdUBO5oLuJGSdsN7Uaxim8E9kyDwOvkq9Kwm6CJ7USktFZwcQD/UJvpDt/qXVojGZ/rILnq966gBCpJMo6Q7f6kdIdv8AUjq965dGxEBRJVoiTvSpFQr0uI7yjEd5XKVCEpK5QhShCg2qS8id3qU5QbSJefL1BMzNK/JN80e5LzR7lzzZRzZVqrjcl5orqkIcPELjmyloiHDxCDkiFZpF2xsmE/SoAHMgrmLgFeGkqKolv/Z8/wCSuKtJpGRAVbetMDBBnWfuUscCVFRsNUDAYlcroPMQgBdCoSNbKeoHC7NMtdC6aZKEBTekDcU6x0iVCUqznqqtzQArWmSnEqEJEyRCEIQlQhIhCCo/TG96kO0VSmaAUjzCndMb3o6Y3vUFCe4El8rBJaby0hzSQQZBGoI2pELzClbKwXsytBc5rXwJByzAjKdQVYYBvXnqtbht7m1G0ySWuMAHYTpHn61q2e3yQ143T7qCtZgG9I4Z6rrmj3LhzYWooIVsuUqRUK9CEIQhcPrNBguAK56SztDioFtbNSO4epMVaeEwnDJCrLyrfpLO0FCrmXHCZ/7KGnqOmSYNhKXTgnMBRgKWHd6Id3plCTAUtEdYeIRDu9LR9ITvCg5IGaskiVIqVehRbfs8/wCSkvdAlQrVVmMt/wDJM0HNI44JhdNfCUNESm1aq8kLqnquV1T1QgJ5SbNp5qMktF4MoU8TztyA1cYGQCSo4NbJThSLZahTbiOgzPgFS0eVdNzsJY5oOjiRHnuVFe9+vr9WA1nZGZPidv3KqWVVtuI0eW/X6hBcZXpHTf4fv/2R03+H7/8AZUtx2rnKQnVvVPloeHqKnrUZde0OGRS3ypjbYdwXXSDuChs1Tye6FIcVOdoqlW7tFUJKamohCEKxVrBJWhRG1Hb0/TtGzavLwrITr13ZqmF7XbnA8DKaQgGDIULd2aqKgxMIcO4+sbCuyIWEo1nMOJji07wYWouS8zWBa/0mxnvG+N/tW1Z7aKrrpEHwPqlIWpQhZC+b4bXqvoUHuDqBio7MNLnGMIIMkgtIOUeKse4tEgTuXUxl90TCmXjyraxxbTZjgwXEw2Ruyz+5MWflhn8JSy3tOY8jrxWHoX019QUmMqOeThAGHM+blJvO1us+E1qNRgdMH4MzGujis41bUTMHwV3RR+QcPlb6raW1DjpukECCPDTuK6p0y6ZOnmvPGXu8aWe1jwYR6iuxflX5G2fVd7V1ttj4ANMyl6G2f3Bz3rdOCfozGS88dftQAk0bWAMyS0gAbSTKbPKaA0xX64JbBGcOLdA7eCm6a78Z4hQLE38g4fK9L63ejrd68398b5w4LXi7MGdmyZ2jiN6WlyhqO9Gna3ZkdUE5jUZHVR0x34zxCnobfyc8V6P1u9dUZxCd4XmjuUrwCSy1AAAk5wGu9EkzkDBg7YXd38oueqNptNYOdMEnLJpdsd3KemOOGjPEI6G3rjh8r1pIs7ycvphc6yOc41qbS8l2Yc0w6WumTGJoIMK56Qe5XMlwnL0VLxddCdtHoqDV2KQ+sSIyUersVzRAVTim0JxsRnqm0yrShp3Jaeq792BQDWmlWfidE02hwblq/MEDXPPTwUJt6U+e5uH4i0vjA+MOKNyUOJMFNdyIViQsLe1sNWoXTkMmjc0e3Va63cpqRD2mnWYWmBjaG4tc2CZI7yBrvyWGYFmW6teDW8R5eqZwgpELp8LlZqVW3JqoRVLdhaeIzH8+K1XN5SsLY7Qab2vGw6bwciOC2lmtQqNDmmR6u47itf6fUBYWax5f2ohOs1TyZZqnloBSFPdoqhW7tFUKummehCUIhWKteavO5Nq5tXJus2tzTXMeebL8spAeG7duaprUxzHYHAtdMEEZjy/rVeddTe3MK+7JAUilX2Hinw4HQhLcdcMe6oabnlrHFgDS6HjNpc1ucZFPV7ZWrtZUrU8LgDicGlgwud8GCDugwc8iNqqIT6E6MvnLUmVLui1ilVDj6OYPgdvGFCLxvCUFDXFhDhqVC9TbVaWhwIwkSDsg7ZXndgsbWWq1vY/Gyo8PadDLnPc4eALsjtWitrjSsAZniwtB7sTpI++FQXR+34N9ZWuap0rGRE4ngfZX0nfeAspd931qNdtYBjsLy6MRE67Yy1Vnypr1rYGDmaVIMk9V0gz3YR/UJ+z2GgWzzQ1O07z3p+nd9md/djbqTsMb+5cnSDt/6/yVfSCP6+Vn+g1fkbP9paP+YnrJcdeq6Wss4gZsNSuAZ/a9MnLuI1zV++7aFOnUrCkDzdNzwJOZa0ujXuUrk9cbnEttDmVQ4B2hbhy6zZESJIjwKspVZcATnuj1Kta57qZqDIbtveqF/JW1EEc3ZRIIkVbRInbm8jiCkbyNtkUo5iaekvdmecL9MGWsLankvY/kG8X+1dM5LWOPiG8X/mWjoxyVULQeR8rNVLjt5JOCyicsnvHUIpAtjDEHmmbI1EQYUT3p23CW4LLm6oR1n9UVWPY5rBh6rYfp/C3dnsvevYv3dnF/5lKsvJqyMzFBoJ73e1KWNGrxTCsT/XysPauTl4Pa5oFmaHkudDnEy7nS+C5pLQ7nXZDZltMxrq5IWmz1W1qhpYWzOFxJ6zS0QC0bSFvrTyfsjznRaY0zd+ZQbbcNmpDnKdJrXN0MuMTAOp3EouDZ4qW1iXAeijXJcjm2ypbHOGF1PAxomZwtaS7LL0TAz12LSEpiwegPP1lMU7IKrnueTDXRkdB3BM57aTLxQRfeZ1KbiG8LioVHNz05/bg6QRI7iI17k1bbCyk0ubixCCHTlJPhmIlVttbXGACjRA4AqUhUPKN9ta+i6zOGAva2pTwBxOJ0Yi4zDRtiCNZKtbttgrUmVQCMQmDsOhE7cwc1e2oC4t2Kp1MtaHbVJUJ78NoxbrO48HgqamHsY1xrPcGhtMtJJAaGziJJPgFXabQ2hTvu/spqFI1X3Qs9RuqtXJqP6uIySdfJusKwbydbGdR3kAPas/fv6S6FORZ2c7GtRxwU/La77h3rLVf0m2smQ+zt7g38zivOihaX45dvJK0BSszMDjzwXpPvbZ23fd7Ee9tnbd93sXmjP0j206VKJ8GNP805+sK39un9mFPQ7T1hx/im/wAr1PD5Xo/vbZ23fd7FJsF0Ck7E2o7vBiD4ry79YVv7dP7MI/WDb+3T+zCltltTTIcJ7f4oiy9TwXsYC6xLxv8AWHb+3S+zCP1h2/t0vswuj/UOvz/xRFl6nn7r2s2o7gosLyFn6RLcNtE9xp+whX1y/pMa4htqpYJ/vKclo+cw5geBKQu+oMxDp7IPgR5KbtldgW+a38JElCs17Q9jg5rhLXAyCDoQRqu1fQ+sNuxWBncPQkQqKv050zTOG/4GKqL+vAULYx5a9+Kg9jWsEuLucYQAPIrk3KbQ11S0dWq6MIaZ5pgmGbnHMl28nuC65R1ObtlkqnJuKqxx7ntET958lKo3u17wxgyz6xy4DU7F21atNjXaU4bNuAPrCoIm61ubtfeed65uWwCgzm5Bf6TiNskgeWUeRUm14cMOaXNMggAnIjPIZriy1MbqhygOwD/Dr95KS9K7mU3ObqPunKY2rzLA11UXzgcyNWvDsOC1i+5RJYMhh3YeIWKpXTVqPe2mx2FriMTurnqAQc5wkHzC0Vz8nxSIdUcHO1DR6IO/PU8FEu68nU8LTBZPWyzMmXOJ2uJJK0jrRTxYQ9s7pE8F6GyU6DvuzI2rBc6Tgn69EPaWu0IgrNU7tfQc8OgtIGFw2wTMjYcwtSq2+fRHn/JdtSm0kPOYVtL9YWastgqxHNukEgwCYJz2dxB813YLsqvaXNpkgy6chtO8rQXdbw2zjU1HNLjlHwjpJBnYCY8An7htHwNNlJjnFrA0uILWBwEOzOZznQFZws1ImL3kqxTkOA2+/rCzl+sdQpsYCBjBMgzLYE8ZC55PXrU59oc8w7q7Ncy2e+fWnOUNDC+rJnBSY0bg6o/FDRsAaDkqGzNcXAs9NvXb3uZ1o+4rvo0WsaMMVBMS1pw9l6QnaZUWzVxUY17dHNDh4ESqrlHd9eq6hzVpqUWNLy7mzDnv6vNgyILR1pBmZ02hq1QU23ils9I1agY1aWm4kpypUhIwQFGfaGk+k2d0hGEqZICqr65V2WyPZTr1MLniR1XOAbMYnEDqtmczuO5Sr5PwZ8vWFiuVtGzVrSCWvdBFOvDoDmNkYWbiCSJy/mtVWtDKlnDqc4YAE6jCQIM7ckC9LpGGpWgM+wg4692Kl2D0B5+spuxOh9QjXnCnLB8WPP1lLdxbNTEP70w6M2mIkHfmqbX+zwTj9budalAQSRqR1myYAEzA889o4qsv1rm0xUaJYeqR+0JIId4AiJ/iVo2hBxE9UZgjbuA7/UoV6PL6TnEAEQIGbYxCAO/u8VmsH3ga59eHvqhX0n3XhzhIyjcec9RVVYXVKjnc5ikQQ3MYddP62Kzs4A6oERsiMjOziqmz3qxtSoHE4SeqQJ3eyfNQr6vxwxuokj4M5kDUAuBAPiq7PVfTtbnOJLTI3HIA+C0vqNKbOHFt0Q2IGAJjDz78TJWlNVsxiE7pE8F5Z+ky/X1K5szSRSpxiGgfU1JO8N0HeD3LRciLwa6k81Whz2ufUDy1smAHHOJmSTPesLyxcTXBOpYCfEuctSrFV17UzzJI8ACe+VkUvsBG0+Ax8fRV102upRrU69IAvpOD2hzS9sjtNESM947iDC2x/SveozNGxgfQV/8AnrNcj/jX/R/6mrRXz8RV+jd6layjeZelQ6pDohUnKjlVbbxFMWinSApkubzVJ7ZLgAZLnukRsEecCM/zDtMLp3QZ4L0Gwn4Kn8xv4Qqq0Wrm7U44Kj5pNEMEkdY5nPRMbOAAZ8FAqzqWU6O/sP8Aqn2I6O/sP+qfYtn7sH93tX1B7Ue7B/d7V9Qe1HR27fBGkOxYzo7+w/6p9iOjv7D/AKp9i2jb1J/8vafqD2obezjpZrV5M/3RoGdbwRpDsWLFlqfJv+qfYkbZ3mQGPJGownLxyyXoVO/CBAsls+zH5lV2S+S2raCKFol72mA3rNhkQ4TkUpotwx8E187FX8neUVssTXMpsxMJnA9ryGu2lsEETt2K3/WJb/kKP2dX86T3YP7vafqD2pfdc/u9p+oPaq3/AE+g83nYnsTNtNVogLT3hb31nS85Tk0aD+t6lUrnD2NJOsOgiRkQR6gmxYm7zxHsVvZbRTePg3scP4XB3qWGXudLvFTY6Ie4lypXWyrQJpteCB3A5nPaJ2hcVr3quBBcIIEiBnn4KPaTiqvO+oR9Xqf6UrKILsOySOBKksbsxXqhRossl26J0ZOWq754pgunRciToD5KzF3t3u4j2LOcsrTWsrGGzPeHOxSJicOCOGIp6QbUcGbfYleLYyTC9DoWsMoMe8ycDZ3kwMvFVZtjqpcXaCIGwZrzfkpfVtr1m07RUfhcYiYkYXHMZ7QF6LTpBoMTsWm6sTXYycI9D7K1jLtQKoa60gQK1PbrT8T2lYUrxr2cYWV31QYzqQ4NcBnh0gGQcM5Jqq0A4gcgJ8XZgR3b0zZA0y1xgZHWMxlt8Vmi0Pbi3yHstah9OaLI6tV3GABIE5CdZEHHIEb1Rctr0qllOX9YvxPc1uAucwOa0yDoGuAhZy7LzrCtScKjpFRkSZHpDUbQrnl5SY3mQ0zPOTmDpg3eJWasImowfxt/EF6KwkvswcczPmQsl5DiTEbtnlq45r2K7jXxU29JoYSR1G0oMTJA6/VOuxaK8a7qdGo9jMbmsc5rNMTgDhbOyTAWRs7WU3CoHElpmMTc42LTVr5ptoisA9zSYIbEtJ2OBIj/AHWA+0GtBjLt5x3Rgu2xUXuaTGZjZqyVTyhtFoNCi8FtNz2jnGEYgHFodhGY0MjyWbfXtIE42EAEkilIEbzOS0N4XnTtAaILcJkyRmTll/W1ZW/70pUHNHR6VWGy5zmknMmGipED79VWHOc8Ma2TsgcJKSpY5ruFT7QBjhrgLuxWR9UtAIlx1OkkTmrK7H1cGDnWhkkmkWS50gZioD1YIGUbDvWVuXlg2m4GrSfIcT1IIjZGIjNaC4ararRW67ZyDHwDDZE4e/Na1V9em4XhgXR5d/OKs0FmFna5p/xIbhjnJvYbhGeS1LL3pUmhricQnIAnUyM9PvUu5KmPG/RpdiM7AfDb4KgtFja5xJmfHuV3cLOoWA/tZDYYG0rnqWh1S+w5A+q4QIc7nWrRlYOiB8HGhyIG87Qf+yh3wz4IlubMoPfIme9Pv7I3+ZKj3iYpOaDrGLycMlRRMvbO0JxiV5VVvOo0uz0J2Depl21zVY4vz6xGzSG5ZeKq73p4alVo0D3cMWS0PJaxNdQDjObnfdl/JVPIDJXdbK1R9nALictZXVx0wylXAaWkCNMjjqASDt6oWM5X/HN+jH4nL0e02drKL8M5uYOGIrzjlf8AHN+jH4nLRsmNnc7a70Cz25t7D/6KXkf8a/6P/U1aK+fiKv0bvUs9yQHwr/o/9TVob5+Iq/Ru9S0KP7XFJU/WnbD8VT+Y38IUOl/a3/Qt/EVMsPxVP5jfwhQ6X9rf9C38RVpybzqSaz3qzQ0JQ1BcmlKutcgp1GlhHrXFmo4czr6k5VqBokqJUgLi0VsI79ntWduw/DWn57fwK0e8kyVVXX8dafnt/AlObe30KBkVaJZXVGliPrUzozdycuUQrWDuUSrddFxxOo0ydjsAxDwdEhbuUSvONsZaZD47vldRo7155SogVQ0DIHTuBTlNvwrvFx4H/dXdzEG2Wkzmwx9d0iN+QS3e8dPrZ6Mn65ZH80mgJzOeHzmvQVKzTfaHYaEN7zHj92ShQdxWR5fj4n/3P+GvW+eG/wBawf6UrJUrdH5pj34ednCCYnmongeCuo2W48Onw3RtWCKcGZWG5Mf2ql84/gcvSIyKxvIy6q9O20Hvo1GtDnS4tIA6jxr5r0m/qgLW+f8AJdOimu1+z591N3GVnuT1n5ytFQAtAOWozDuGeatL7uukAzm24czMSZ03rjkeetVHc31uWkNYDfms2nSvgCc/n2XfVq1GyGuI5CxIumm4jnGNeM8ntBGneualw2eBhoUmkOmWsbPds8OC2FvrA03a7PWE1ZKoD3+DPUn0LmuuBx5nfuQx7tC4kyccYH+33WVN3d7uCYs9IkPEkQDI8N/BbzpA71Q2dhZXtIg4X0nuHnB9biFJst3Cc9ysstd+hqsc/UCMtThPERwVFZbJjBOeRjIKDypu3/wtU9bqgO07LgT90ra8mvg6ABBkuLvUB6lJvoCrZ61I5Y6T2ydmJhEqyhQh7al7Ig8D2qv6hVe+0VLrsJiMNWHovF2WQ1qtjo5nFSaT4Y6hdH+Fi2zaZbWw7BtOvozomeQdgPSWVX6UbHTpjX03kk6gaDGP8Stb3dNrcfD/APMK+1XXVKZaZAPiXEnnvVNJr2F4dOWRHZCfcw7iotSq0EgkTulaq6qoFNoM6n8RXh/ulWcSXVqhJMklxkneVNOlo6jnA5+65w264navRhVb2m8Qg12dpvELzZ95VRlzr/rFce6NX5V/1iunSOTSr+9KBNW1Zei0u8OtT9q0fJqgRZqWRzBOh2ucVBuikalG2VH1abnOsdOS6o3ECWNeTUk9ScEy6FuuSwDbHZ24mmKTcw4OBymQRkR3rNNnvC7OW7ZgnqtlgbOzyWG5fFzbESMTTz1PMSP2ai8wc4kySSd5zPFeyfpgzsLfpmepy8bVtnp3A5uePo1VEQAN3qVecj/jX/R/6mrRXz8RV+jd6ln+Rnxr9fi9nzmrR30B0erkfi3epa1H9riuap+tdWH4qn8xv4QodL+1v+hb+IqwsAHNU8neg38IVTabZTpWtxe7CDRaBIJzxHcFYTAbPOCQZlXIcVLslH9o+XtVNQv2yT1qo+q/P/Kpnvnsnyw+pU/Kg1G7UBp2K2c4ASVXVqhcZ4KvtHKSzOOVXL5r+Popv3es3yv+V/5UB7No4oLTsViq66GE17SB22/gSe71m+V/yv8Aypq576s9OpaHOqAB72lpwvzAbB0blnvUOqNkY8wVIacVqqVMNEBdqlqcqLLGVWT81/5VF98tH5b/ACu/Ki+3aOKII1L2FcuaDqoxtfgjpfgsyV3LpthphxeGNDjq4AYj4nUrn3Pp4seEY4jFAxRuxRKOl+COl+Cm8iE50cb0jrKDrB8QuOl+COl+CiUJRYxsjgh9kB1g+IlJ0vwR0vwRKFw27WCQGsE6w0CY35JwWSJIjPXvSdL8EG1+CjBTJyXVSyYhBwkHUHMJunYGtMtawGIkAAxukDTILrpfgjpfgjBTedETz2ZLro57lFqXPTc81XU6ZeaZpl5HWNMmSwmPRnYpHS/BHS/BTKWFzZLubSY2nTaxjGiGtaIAG4BOGzHbC56X4I6X4IlEIp2MN9ENHgI9QXLruaTiLWE7y0E8YXXS/BHS/BRgpJJXbbLGkDwCi+4lD5Gj9m32J/pfgjpfgplRCY9xKHyVH7NnsS+4lD5Gl9mz2J7pfgjpfgiUQm23PQALRSpgOjEAxoBjMSIzhSKdla0AAQAIAEAADYANE30vwR0vwUyiExe9jouZFanTeyZIqND25aGHTmFU0LksDxLbJYyNPiaf5Vb2uoHtLXREZ571Gs1OnTBDTqZ1lYVtfUbXN04Yazsj0XdQaw08RisHfNlp0bxLaNOnTb0Vpw02hjZNV0mG5TkOCYvl55irn/du9St+U90Wh9rFooCk8GiKZDn4CC17nTpmDI+9Vdrua31GOYaNAYmkTzwynyW5Y7bRbZ2te8Xo91nV7PUNUlrcF1YHnmqef7DfwhP8nLFSrW6qK1KnVAs7CBUY14BxnMBwyKj0bpt7WtbzNAwAJ54bBG5XHJK669KvVr2gUmYqbabWtfjJhxcSTGSW3W2i6zubTfjhkiz2eoKoLm4K997ti/crJ9jT9ir76s912RmOtZbIJya0UKZe47mtjPx0G1aDnW9oLyGpaDeFrfVe+KeeGTAbRacLGgkQ0uJbJOhcScgsiyNqVnwXGBniu+uWMGAE9im1+VFknqXRY8OzG2mHHxDaZA4lWdyX5ddZwp1rBZaD3GATSpOpknZzmEQfEDxUy7bgqupl1OlTpg03NwkDN4Ih4fBL2kbSTnMZQqLlFcgAf1GscwaZN54NHwjxTGTRk5wIABAjMrVfZWkQCR3n1JXGKpnUe4Lf+92xfuVk+xp+xHvdsX7lZPsafsVJ+ju+TVs7qVR0vouDQSczTcJYT3iHN/whavnW7wsKq6tTeWFxw3n3WixrHNBgKrtFy3fTaXvslja1okuNGmABwWf92rk/d7P/APE/6FUfpBvR9e1tsdM9SngkA5Pr1c2g9zWlv1+5RfcCz/v9P7Kp7Fp2ayufTDnvdjvXJUqhroaBwWghEJUL0ErKhJCISoRKISQiEqESiEkIhKhEohJCISoRKISQiEqESiEQkhKhEohJCISpQ1EohcwiEqESiEkIhKhEohJCISoRKISQiEqESiEkKQy0P0xu4pmN6UuSua136hPbimaS3JPutj+2eK56XU7buKYQk0NPqjgPZNff1jxKf6XU7bkdLqdsphCNDT6o4D2RpH9Y8Snza39orMXfSFO0VqLRTaHNBYHtlkNIdAEH9nFoJ6sLQKBet2irDgcNRvouHdnGWeu3YodSaB9oA7AB5KWvM/cVr7kvugKDQXhuFp1bgDmsIBe1omGzl4grO8prwa59aoObhjHMIcwYyXMLGFr88QcSNoMZxAlUhr2sSH0GVCWYMWYlvgxwA03A6zqlbd9auW9IIaxsYabe4QNp2ZSSTGWSruuOEKyWjGVL5K0zSpBw6rn5k7SAThniT5q6dbH9sqKBGQ0Sq3Q0zm0HuCq0jtRPEqjvcNp2mlaCB1ng1HRMlsCTvhv4VY+51bdYf/qTlssrarCx2h4g7CFRe9b/ANUfU/6kj6ZB+0KxtQRiVrcFLtO4JcFLtO4KKhXrnhScFLtO4IwUu07goyEIhScFLtO4IwUu07goyEIhScFLtO4IwUu07goyEIhScFLtO4IwUu07goyEIhScFLtO4IwUu07goyEIhScFLtO4IwUu07goyEIhShTpdp3BBbS7TuCZd7U2iEQpOCl2ncEYKXadwUZCEQpOCl2ncEYKXadwUZCEQpOCl2ncEYKXadwUZCEQpOCl2ncEYKXadwUZCEQpRFLtO4JMFLtO4KMhCmFJwUu07gjBS7TuCjIQohScFLtO4IwUu07goyEIhScFLtO4IwUu07goyEIhScFLtO4IwUu07goyEIhScFLtO4IwUu07goyEIhScFLtO4IwUu07goyEIhf/Z");
    background-repeat:no-repeat;
    background-size: 100%;
}
p {
	text-align: center;
	font-size: xx-large;
	font-weight: bold;
	font-style: oblique;
}
form {
	font-size:x-large;
	font-weight: bold;
	font-style: italic;
	color: blue;
	
}
h1 {
	text-align: center;
	font-size: xx-large;
	font-style: italic;
	font-weight: bolder;
	text-decoration: underline;
	color: blue;
}

    </style>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-light bg-light" style="font-style: oblique;">
<img alt="adress is wrong" src="https://www.volvobuses.com/content/dam/volvo/volvo-buses/markets/global/en-en/news/2020/1860x1050-Volvo-Bus-KSRTC-2020.jpg" width="200" height="100">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">HOME</a>
         <a class="nav-link active" aria-current="page" href="search.jsp">SEARCH</a>
          
        </li>
       
       
      </ul>
    </div>
  </div>
</nav>
<h1>Bus Stop Information</h1>
<p style="color: green;">${message}</p>
<p style="color: red;">${error}</p>
  <form  action="save" method="post" style=" text-align: center;">
  <pre>
    
             BusName: <input type="text"  name="busName" value="${dto.busName}">
  
        FromStopName: <input type="text"  name="fromStopName" value="${dto.fromStopName}">
  
 DestinationStopName: <input type="text" name="destinationStopName" value="${dto.destinationStopName}">
        
        NoOfBuses :   <input type="text" name="size" value="${dto.noOfBuses}">
        
        TicketPrize:  <input type="text" name="ticketPrize" value="${dto.ticketPrize}"> 

        Maintenance:  <input type="text" name="maintenance" value="${dto.maintenance}">   
   
               <input type="submit" value="submit"  class="btn-primary">
        
 </pre>
 </form>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>